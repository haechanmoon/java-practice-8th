package domain;

import java.util.List;

public class Calendar {

    private static final List<Integer> isHoliday = List.of(1,7,8,14,15,21,22,25,28,29);

    public static boolean isMonday(int date){
        int mon = date%7;
        return mon==2;
    }

    public static boolean isHoliday(int date){
        return isHoliday.contains(date);
    }


}
