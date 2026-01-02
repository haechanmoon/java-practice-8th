package controller;

import utils.Validator;

public class MonthDay {
    public final int month;
    public final String parseDay;


    public MonthDay(int month, String parseDay) {
        Validator.validateMonthError(month);
        Validator.validateDayError(parseDay);
        this.month = month;

        this.parseDay = parseDay;
    }
}
