package controller;

import domain.LottoStore;
import domain.Lottos;
import domain.NumberGenerator;
import domain.Rank;
import domain.Statistics;
import domain.WinningNumbers;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import utils.Parser;
import view.InputView;
import view.OutputView;

public class LottoGame {

    private final NumberGenerator numberGenerator;

    public LottoGame(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void start() {
        //1. 돈을 받는다.
        int money = receiveMoney();
        //2. 로또들을 생성한다.
        Lottos lottos = purchaseLottos(money);
        //3. 통게를 출력한다.
        Map<Rank, Integer> result = printStatistics(lottos);
        //4. 수익률을 출력한다.
        printPrizeRatio(money, result);
    }

    private void printPrizeRatio(int money, Map<Rank, Integer> result) {
        Statistics statistics = new Statistics(result);
        double ratio = statistics.calculateRate(money);
        OutputView.printWinRate(ratio);
    }

    private Map<Rank, Integer>  printStatistics(Lottos lottos) {
        OutputView.requestWinningNumbers();
        List<Integer> winNums = retry(()->Parser.parseNumbers(InputView.readInput()));
        WinningNumbers winningNumbers = retry(()->{
            OutputView.requestBonusNumber();
            int bonus = Parser.parseBonus(InputView.readInput());
            return new WinningNumbers(winNums,bonus);
        });

        OutputView.printStatisticsHeader();
        Map<Rank, Integer> result = lottos.calculateResult(winningNumbers);
        OutputView.printResult(result);
        return result;
    }

    private Lottos purchaseLottos(int money) {
        LottoStore lottoStore = new LottoStore(money);
        Lottos lottos = lottoStore.generateLottos(numberGenerator);
        OutputView.printLottosHeader(money);
        OutputView.printLottos(lottos.lottoNumbers());
        return lottos;
    }

    private int receiveMoney() {
        OutputView.requestMoney();
        return retry(()-> Parser.parseMoney(InputView.readInput()));

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
