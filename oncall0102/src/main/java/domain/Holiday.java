package domain;

public enum Holiday {
    SHIN(1, 1),
    SAM(3, 1),
    MAY(5, 5),
    HYEN(6, 6),
    GWHANG(8, 15),
    GAE(10, 3),
    HAN(10, 9),
    CHRIS(12, 25);

    private final int month;
    private final int date;

    Holiday(int month, int date) {
        this.month = month;
        this.date = date;
    }

    public static boolean checkHoliday(int month, int date) {
        for (Holiday holiday : Holiday.values()) {
            if (holiday.month == month && date == holiday.date) {
                return true;
            }
        }
        return false;
    }
}
