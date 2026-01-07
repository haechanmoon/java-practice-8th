package view;

import java.util.List;
import utils.Messages;

public class OutputView {
    public static void requestNames() {
        System.out.println(Messages.REQUEST_NAMES);
    }

    public static void printError(String message) {
        System.out.println(message);
    }

    public static void printHuntersStatus(List<String> hunters) {
        for(String val : hunters){
            System.out.println(val);
        }
    }

    public static void printStartHeader() {
        System.out.println(Messages.PRINT_START_HEADER);
    }

    public static void printRoundHeader(int i) {
        System.out.printf(Messages.PRINT_ROUND_HEADER,i);
    }

    public static void printResultHeader() {
        System.out.println(Messages.PRINT_RESULT_HEADER);
    }

    public static void printLiveHunters(List<String> liveHunters) {
        String lives = String.join(", ",liveHunters);
        System.out.println("생존자: "+lives);
    }

    public static void printTotalGold(int totalGold) {
        System.out.printf("총 획득 골드: %dG%n",totalGold);
    }

    public static void printDeadHunters(List<String> deadHunters) {
        String dead = String.join(", ",deadHunters);
        System.out.printf("사망자: %s",dead);
    }

    public static void requestSize() {
        System.out.println(Messages.REQUEST_SIZE);
    }
}
