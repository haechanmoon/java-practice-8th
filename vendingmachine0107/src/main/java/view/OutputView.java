package view;

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

    public static void printStatistics(Map<Rank, Integer> result) {
        System.out.println(Messages.PRINT_STATISTICS_HEADER);
        for(Rank rank : Rank.values()){
            System.out.printf(Messages.PRINT_STATISTICS
                    , rank.getName(),rank.getPrize(), result.getOrDefault(rank,0));
        }
    }

    public static void printWinRate(double ratio) {
        System.out.printf(Messages.PRINT_WIN_RATE,ratio);
    }
}
