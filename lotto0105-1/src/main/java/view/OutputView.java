package view;

import domain.Lotto;
import domain.Lottos;
import domain.Rank;
import java.util.Map;
import utils.Messages;

public class OutputView {
    private static final int MONEY_UNIT = 1000;

    public static void printError(String message) {
        System.out.println(message);
    }

    public static void requestMoney() {
        System.out.println(Messages.REQUEST_MONEY);
    }

    public static void printLottoHeader(int money) {
        System.out.printf("%d"+Messages.PRINT_LOTTO_HEADER+"%n",money/MONEY_UNIT);
    }

    public static void printLottos(Lottos lottos) {
        StringBuilder sb = new StringBuilder();
        for(Lotto lotto : lottos.getLottos()){
            sb.append(lotto.toString()).append("\n");
        }
        System.out.println(sb);
    }

    public static void requestWinningNumbers() {
        System.out.println(Messages.REQUEST_WINNING_NUMBERS);
    }

    public static void requestBonusNumber() {
        System.out.println(Messages.REQUEST_BONUS_NUMBER);
    }

    public static void printStatisticsHeader() {
        System.out.println(Messages.PRINT_STATISTICS_HEADER);
    }

    public static void printStatistics(Map<Rank, Integer> mapping) {
        for(Rank rank : Rank.values()){
            if(rank==Rank.MISS){
                continue;
            }
            System.out.println(statistics(rank,mapping.get(rank)));
        }
    }

    private static String statistics(Rank rank, int count) {
       if(rank == Rank.SECOND){
           return String.format("%d개 일치, 보너스 볼 일치 (%,d원) - %d개",rank.getMatchCount(), rank.getPrize(), count);
       }
       return String.format("%d개 일치 (%,d원) - %d개",rank.getMatchCount(), rank.getPrize(), count);
    }

    public static void printRatio(double ratio) {
        System.out.printf(Messages.PRINT_RATIO,ratio);
    }
}
