package domain;

public enum Month {
    JAN(1, 31),
    FEB(2, 28),
    MARCH(3, 31),
    APRIL(4, 30),
    MAY(5, 31),
    JUNE(6, 30),
    JULY(7, 31),
    AUG(8, 31),
    SEP(9, 30),
    OCT(10, 31),
    NOV(11, 30),
    DEC(12, 31);

    public final int num;
    public final int dateCount;

    Month(int num, int dateCount) {
        this.num = num;
        this.dateCount = dateCount;
    }

    public static Month valueOf(int num) {
        for (Month month : Month.values()) {
            if (month.num == num) {
                return month;
            }
        }
        return DEC;
    }
}
