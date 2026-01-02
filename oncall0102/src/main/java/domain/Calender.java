package domain;

import java.util.ArrayList;
import java.util.List;

public class Calender {

    private final Month month;
    private final Day day;

    public Calender(int month, String day) {
        this.month = Month.valueOf(month);
        this.day = Day.valueOf(day);
    }

    public void calculate() {
        List<Day> days = new ArrayList<>();

    }
}
