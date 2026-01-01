package view;

import domain.Result;
import utils.Messages;

public class OutputView {
    public static void printStartGame() {
        System.out.println(Messages.PRINT_GAME_START);
    }

    public static void requestNumber() {
        System.out.print(Messages.REQUEST_NUMBER);
    }

    public static void printResult(Result result) {
        System.out.println(result.convertResult());
    }

    public static void printStrike() {
        System.out.println(Messages.PRINT_THREE_STRIKE);
    }

    public static void requestRetry() {
        System.out.println(Messages.REQUEST_RETRY);
    }

    public static void printError(String message) {
        System.out.println(message);
    }
}
