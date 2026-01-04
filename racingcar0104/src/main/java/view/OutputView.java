package view;

import utils.Messages;

public class OutputView {
    public static void requestNames() {
        System.out.println(Messages.REQUEST_NAMES);
    }

    public static void requestTurns() {
        System.out.println(Messages.REQUEST_TURNS);
    }

    public static void printCarsPosition(String positions) {
        System.out.println(positions);
    }

    public static void printWinners(String winner) {
        System.out.println(Messages.PRINT_WINNER+winner);
    }

    public static void printResultHeader() {
        System.out.println(Messages.PRINT_HEADER);
    }
}
