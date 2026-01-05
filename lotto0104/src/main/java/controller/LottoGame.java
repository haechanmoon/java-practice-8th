package controller;

import domain.Lotto;
import domain.LottoStore;
import domain.Lottos;
import domain.NumberGenerator;
import domain.RandomGenerator;
import domain.Rank;
import domain.WinningNumbers;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import utils.Parser;
import view.InputView;
import view.OutputView;

public class LottoGame {
    public void start() {

        System.out.println("구입금액을 입력해 주세요.");
        int money = retry(()-> Parser.parseMoney(InputView.readInput()));
        NumberGenerator numberGenerator = new RandomGenerator();
        LottoStore lottoStore = new LottoStore(money);
        Lottos lottos = lottoStore.generateLottos(numberGenerator);

        System.out.printf("%d개를 구매했습니다.", lottos.getLottos().size());

        for (Lotto lotto : lottos.getLottos()) {
            System.out.println(lotto.toString());

        }
        System.out.println("\n" + "당첨 번호를 입력해 주세요.");
        List<Integer> winNums = retry(()->Parser.parseWinNums(InputView.readInput()));
        System.out.println("보너스 번호를 입력해 주세요.");
        int bonusNumber = retry(()-> Parser.parseBonusNum(InputView.readInput(), winNums));
        WinningNumbers winningNumbers = new WinningNumbers(winNums);
        Map<Rank, Integer> list = new EnumMap<>(Rank.class);
        for(Rank rank : Rank.values()){
            list.put(rank,0);
        }
        for (Lotto lotto : lottos.getLottos()) {

            Rank rank = Rank.valueOf(lotto.checkCount(winNums), lotto.checkBonus(bonusNumber));
            list.put(rank, list.get(rank) + 1);
        }
        System.out.println("당첨 통계\n"
                + "---");
        for (Rank rank : Rank.values()) {
            if (rank == Rank.MISS) {
                continue;
            } else if (rank == Rank.SECOND) {
                System.out.printf("%d개 일치, 보너스 볼 일치 " + "(%,d원) - %d개%n", rank.matchCount, rank.prize, list.get(rank));
            } else {
                System.out.printf("%d개 일치 " + "(%,d원) - %d개%n", rank.matchCount, rank.prize, list.get(rank));
            }
        }
        double totalCost = 0.0;
        for (Rank rank : Rank.values()) {
            totalCost += list.get(rank) * rank.prize;
        }
        double ratio = totalCost / money;
        System.out.printf("총 수익률은 %.1f%%입니다.", ratio);

    }

    private <T> T retry(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                OutputView.printError(e.getMessage());
            }
        }
    }
}
