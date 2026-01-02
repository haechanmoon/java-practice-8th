package controller;

import domain.Day;
import domain.Month;
import domain.Parser;
import java.util.List;
import java.util.function.Supplier;
import view.InputView;
import view.OutputView;

public class OncallGame {

    public void start() {

        //월과 요일을 받음
        OutputView.requestMonthAndDay();
        String input = InputView.readInput();
        int parseMonth = Parser.parseMonth(input);
        String parseDay = Parser.parseDay(input);

        //돌아가게만 만들자. 진짜 제발.예외 처리 다 신경끄셈.

        Month month = Month.valueOf(parseMonth);
        Day day = Day.valueDay(parseDay);

        // 평일 비상 근무 순번대로 이름 받음
        List<String> weekDayNames = retry(() -> {
            OutputView.requestWeekDayNames();
            String input1 = InputView.readInput();
            return Parser.parseName(input1);
        });

        // 휴일 비상 근무 순번대로 이름 받음
        List<String> wookEndNames = retry(() -> {
            OutputView.requestWeekEndNames();
            String input2 = InputView.readInput();
            return Parser.parseName(input2);
        });
        int count = day.value & 7;
        int size = weekDayNames.size() % 10;
        //이제 쉽게 가. 자. 5월 1일이 휴일이니/ 쉬는날이니?
        for (int i = 0; i < month.dateCount; i++) {

            for (Day day1 : Day.values()) {

                if (day1.value == count + i) {
                    day = day1;
                }
            }
            System.out.printf("%d월 %d일 %s %s%n", month.num, i, day.input, weekDayNames.get(i));

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
