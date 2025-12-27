package view;

import utils.Messages;

public class OutputView {
    public static void requestNames() {
        System.out.println(Messages.REQUEST_NAMES);
    }

    public static void requestTurns() {
        System.out.println(Messages.REQUEST_TURNS);
    }

    public static void printLetterResult() {
        System.out.println(Messages.PRINT_LETTER_RESULT);
    }

    public static void printRunResult(String names) {
        System.out.println(names);
    }
}
