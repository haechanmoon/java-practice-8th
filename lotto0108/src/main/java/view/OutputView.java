package view;

import domain.Rank;
import java.util.List;
import java.util.Map;
import utils.Messages;

public class OutputView {
    private static final int LOTTO_PRICE = 1000;

    public static void requestMoney() {
        System.out.println(Messages.REQUEST_MONEY);
    }

    public static void printError(String message) {
        System.out.println(message);
    }

    public static void requestWinningNumbers() {
        System.out.println(Messages.REQUEST_WINNING_NUMBERS);
    }

    public static void printLottosHeader(int money) {
        System.out.printf(Messages.PRINT_LOTTOS_HEADER,money/LOTTO_PRICE);
    }

    public static void printLottos(List<String> lottos) {
        StringBuilder lottoBoard = new StringBuilder();
        for(String lotto : lottos){
            lottoBoard.append(lotto).append("\n");
        }
        System.out.println(lottoBoard);
    }

    public static void requestBonusNumber() {
        System.out.println(Messages.REQUEST_BONUS_NUMBER);
    }

    public static void printStatisticsHeader() {
        System.out.println(Messages.PRINT_STATISTICS_HEADER);
    }

    public static void printResult(Map<Rank, Integer> result) {
        for(Rank rank : Rank.values()){
            if(rank == Rank.MISS){
                continue;
            }
            if(rank==Rank.SECOND){
                System.out.printf(Messages.PRINT_SECOND_STATISTICS,rank.getMatchCount(), rank.getPrize(),result.getOrDefault(rank,0));
                continue;
            }
            System.out.printf(Messages.PRINT_STATISTICS,rank.getMatchCount(), rank.getPrize(),result.getOrDefault(rank,0));
        }
    }

    public static void printWinRate(double ratio) {
        System.out.printf(Messages.PRINT_WIN_RATE,ratio);
    }
}
