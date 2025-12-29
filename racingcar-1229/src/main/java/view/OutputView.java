package view;

import utils.Messages;

public class OutputView {
    public static void requestName() {
        System.out.println(Messages.REQUEST_NAME);
    }

    public static void requestTurn() {
        System.out.println(Messages.REQUEST_TURN);
    }

    public static void printResult(StringBuilder board) {
        System.out.println(board);
    }

    public static void printWinners(String winner) {
        System.out.println(Messages.PRINT_FINAL_WINNER + winner);
    }
}
