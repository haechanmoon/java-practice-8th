package domain;

public enum Day {

    MONDAY(true, "월", 0),
    TUSEDAY(true, "화", 1),
    WENDSDAY(true, "수", 2),
    THURSDAY(true, "목", 3),
    FRIDAY(true, "금", 4),
    SATURDAY(false, "토", 5),
    SUNDAY(false, "일", 6);

    private final boolean weekday;
    public final String input;
    public final int value;

    Day(boolean weekday, String input, int value) {
        this.weekday = weekday;
        this.input = input;
        this.value = value;
    }

    public static Day valueDay(String input) {
        for (Day day : Day.values()) {
            if (day.input.equals(input)) {
                return day;
            }
        }
        return MONDAY;
    }

    //하.이게 코드의 힘이구나...와. 진짜 재밌다. !
    public Day circleDay() {
        int count = (value + 1) % 7;
        for (Day day : Day.values()) {
            if (day.value == count) {
                return day;
            }
        }
        return MONDAY;
    }

    public boolean isWeekend() {
        return !this.weekday;
    }
}
