package view;

import utils.Messages;

public class OutputView {
    public static void requestInput() {
        System.out.println(Messages.REQUEST_INPUT);
    }

    public static void printResult(int sum) {
        System.out.printf(Messages.PRINT_RESULT,sum);
    }
}
