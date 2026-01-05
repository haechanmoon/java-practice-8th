package controller;

import domain.Lotto;
import domain.LottoStore;
import domain.Lottos;
import domain.NumberGenerator;
import domain.RandomNumberGenerator;
import domain.Statistics;
import domain.WinningNumbers;
import java.util.List;
import java.util.function.Supplier;
import utils.Parser;
import view.InputView;
import view.OutputView;

public class LottoGame {

    public void start() {
        OutputView.requestMoney();
        int money = retry(()->Parser.parseMoney(InputView.readInput()));
        OutputView.printLottoHeader(money);
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        LottoStore lottoStore = new LottoStore(numberGenerator);
        Lottos lottos = lottoStore.generateLotto(money);
        OutputView.printLottos(lottos);
        OutputView.requestWinningNumbers();
        List<Integer> winNums = retry(()-> Parser.parseNumbers(InputView.readInput()));
        OutputView.requestBonusNumber();
        int bonus = retry(()->Parser.parseBonus(InputView.readInput()));
        OutputView.printStatisticsHeader();
        WinningNumbers winningNumbers = new WinningNumbers(winNums,bonus);
        OutputView.printStatistics(winningNumbers.mapping(lottos));
        Statistics statistics = new Statistics(winningNumbers.mapping(lottos));
        OutputView.printRatio(statistics.ratio(money));
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


