package view;

import java.util.List;
import utils.Messages;

public class OutputView {
    public static void requestCarNames() {
        System.out.println(Messages.REQUEST_CAR_NAMES);
    }

    public static void requestTurns() {
        System.out.println(Messages.REQUEST_TURNS);
    }

    public static void printCurrentCars(List<String> strings) {
        for(String val : strings){
            System.out.println(val);
        }
        System.out.print("\n");
    }

    public static void printWinners(List<String> winners) {
        String finalWinners = String.join(", ",winners);
        System.out.printf("최종 우승자 : %s",finalWinners);
    }

    public static void printError(String message) {
        System.out.println(message);
    }
}
