package view;

import domain.Rank;
import java.util.Map;
import utils.Messages;

public class OutputView {

    public static void requestMoney() {
        System.out.println(Messages.REQUEST_MONEY);
    }

    public static void requestWinNumbers() {
        System.out.println(Messages.REQUEST_WIN_NUMBERS);
    }

    public static void requestBonusNumber() {
        System.out.println(Messages.REQUEST_BONUS_NUMBERS);
    }

    public static void printLottoCount(int money) {
        System.out.printf(Messages.PRINT_LOTTO_COUNT, money);
    }

    public static void printLottos(String lotto) {
        System.out.println(lotto);
    }

    public static void printStatistics(Map<Rank, Integer> map) {
        System.out.println(Messages.PRINT_STATISTICS);
        for (Rank rank : Rank.values()) {
            if (rank == Rank.MISS) {
                continue;
            }
            int count = map.getOrDefault(rank, 0);
            System.out.println(rank.getString() + count + "개");
        }
    }

    public static void printRation(double ratio) {
        System.out.printf(Messages.PRINT_RATIO, ratio);
    }
}
