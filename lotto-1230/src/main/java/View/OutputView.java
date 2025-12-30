package View;

import domain.Rank;
import java.util.Map;
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

    public static void printStatistics(Map<Rank, Integer> result) {
        System.out.println(Messages.PRINT_STATISTICS);
        for (Rank rank : Rank.values()) {
            if (rank == Rank.MISS) {
                continue;
            }
            System.out.printf("%d개 일치 (%,d원) - %d개%n", rank.matchCount, rank.prize, result.get(rank));
        }
    }

    public static void printLottoCount(int money) {
        System.out.printf(Messages.PRINT_COUNT, money / 1000);
    }
}
