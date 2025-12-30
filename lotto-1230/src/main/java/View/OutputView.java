package View;

import utils.Messages;

public class OutputView {
    public static void requestMoney() {
        System.out.println(Messages.REQUEST_MONEY);
    }

    public static void printError(String message) {
        System.out.println(message);
    }

    public static void printLotto(String lottos) {
        System.out.println(lottos);
    }

    public static void requestWinningNumbers() {
        System.out.println(Messages.REQUEST_WINNING_NUMBERS);
    }

    public static void requestBonusNumber() {
        System.out.println(Messages.REQUEST_BONUS_NUMBER);
    }

    public static void printRatio(double ratio) {
        System.out.printf(Messages.PRINT_RATIO, ratio);
    }
}
