package domain;

import java.util.List;

public class EvantDay {

    private final List<Integer> STAR_DATE = List.of(3, 10, 17, 24, 25, 31);

    public boolean isStarDate(int date) {
        return STAR_DATE.contains(date);
    }


    public static boolean isWeekend(int date) {
        int weekend = date % 7;
        return weekend == 1 || weekend == 2;
    }

    public int dayDiscount(int date) {
        if (date > 25) {
            return 0;
        }
        return 900 + date * 100;
    }


}
