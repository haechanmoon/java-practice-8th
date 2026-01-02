package view;

import utils.Messages;

public class OutputView {
    public static void printError(String message) {
        System.out.println(message);
    }

    public static void requestMonthAndDay() {
        System.out.print(Messages.REQUEST_MONTH_DAY);
    }

    public static void requestWeekDayNames() {
        System.out.print(Messages.REQUEST_WEEKDAY_NAMES);
    }

    public static void requestWeekEndNames() {
        System.out.print(Messages.REQUEST_WEEKEND_NAMES);
    }
}
