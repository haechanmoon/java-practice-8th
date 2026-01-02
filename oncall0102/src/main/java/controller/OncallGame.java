package controller;

import domain.Day;
import domain.Holiday;
import domain.Month;
import domain.Parser;
import java.util.List;
import java.util.function.Supplier;
import view.InputView;
import view.OutputView;

public class OncallGame {

    public void start() {

        //월과 요일을 받음

        MonthDay md = retry(() -> {
            OutputView.requestMonthAndDay();
            String input = InputView.readInput();
            int parseMonth = Parser.parseMonth(input);
            String parseDay = Parser.parseDay(input);
            return new MonthDay(parseMonth, parseDay);
        });

        int parseMonth = md.month;
        String parseDay = md.parseDay;

        Month month = Month.valueOf(parseMonth);
        Day day = Day.valueDay(parseDay);

        Names names = retry(() -> {
            OutputView.requestWeekDayNames();
            List<String> weekdayNames = Parser.parseName(InputView.readInput());

            OutputView.requestWeekEndNames();
            List<String> weekendNames = Parser.parseName(InputView.readInput());
            return new Names(weekdayNames, weekendNames);
        });

        List<String> weekDayNames = names.workingDay;
        List<String> weekEndNames = names.restDay;

        String yesterdayWorker = null;

        for (int i = 1; i <= month.dateCount; i++) {
            boolean isHoliday = Holiday.checkHoliday(month.num, i) || day.isWeekend();
            List<String> currentList = isHoliday ? weekEndNames : weekDayNames;
            String todayWorker = currentList.getFirst();

            if (todayWorker.equals(yesterdayWorker)) {
                String temp = currentList.removeFirst();
                todayWorker = currentList.getFirst();
                currentList.add(1, temp);
            } else {
                currentList.add(currentList.removeFirst());
            }
            if (Holiday.checkHoliday(month.num, i) && !day.isWeekend()) {
                System.out.printf("%d월 %d일 %s(휴일) %s%n", month.num, i, day.input, todayWorker);
            } else {
                System.out.printf("%d월 %d일 %s %s%n", month.num, i, day.input, todayWorker);
            }
            yesterdayWorker = todayWorker;
            day = day.circleDay();
        }


    }

    private <T> T retry(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                OutputView.printError(e.getMessage());
            }
        }
    }

}
