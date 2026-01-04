package controller;

import camp.nextstep.edu.missionutils.DateTimes;
import domain.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import utils.Messages;
import view.InputView;
import view.OutputView;

public class AttendanceGame {
    public void start() {

        LocalDateTime nowTime = DateTimes.now();
        String now = nowTime.format(DateTimeFormatter.ofPattern("MM월 dd일 E요일"));
        int date = Integer.parseInt(now.substring(4,6));
        while(true) {
            OutputView.printStart(now);
            String input = InputView.readInput();
            if(input.equals("Q")){
                break;
            }
            if(input.equals("1")){
                if(Calendar.isHoliday(date)){
                    System.out.printf("[ERROR] %s은 등교일이 아닙니다.",date);
                    throw new IllegalArgumentException();
                }
                if(Calendar.isMonday(date)){

                }
            }
        }
    }

    public long times(){
        LocalTime start = LocalTime.of(13,0);
        LocalTime end = LocalTime.of(13,5);
        long diff = ChronoUnit.MINUTES.between(start,end);
        return diff;
    }

    public Map<String, Integer> mapping(){
        Map<String, Integer> map = new HashMap<>();
        String input = "콜라-10";
        String[] split = input.split("-");
        map.put(split[0],Integer.parseInt(split[1]));

    }
}
