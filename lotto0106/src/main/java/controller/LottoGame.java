package controller;

import domain.LottoStore;
import domain.Lottos;
import domain.NumberGenerator;
import domain.RandomNumberGenerator;
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

    public void start() {
        //돈을 받는다
        int money = readMoney();
        //로또를 생성한다.
        Lottos lottos = purchaseLottos(money);
        //당첨번호/보너스번호를 받는다.
        WinningNumbers winningNumbers = readNumbers();
        //결과를 mapping한다.
        Map<Rank, Integer> result = lottos.result(winningNumbers);
        //결과를 출력한다.
        printResult(result,money);
    }

    private void printResult(Map<Rank, Integer> result, int money) {
        OutputView.printStatisticsHeader();
        OutputView.printStatistics(result);
        Statistics statistics = new Statistics(result);
        OutputView.printRatio(statistics.ratio(money));
    }

    private WinningNumbers readNumbers() {
        OutputView.requestWinningNumbers();
        List<Integer> winNums = retry(()-> Parser.parseNumbers(InputView.readInput()));
        OutputView.requestBonusNumber();
        return retry(()-> {
            int bonus = retry(()->Parser.parseBonus(InputView.readInput()));
            return new WinningNumbers(winNums,bonus);
        });
    }

    private Lottos purchaseLottos(int money) {
        OutputView.printLottoHeader(money);
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        LottoStore lottoStore = new LottoStore(numberGenerator);
        Lottos lottos = lottoStore.generateLotto(money);
        OutputView.printLottos(lottos);
        return lottos;
    }

    private int readMoney() {
        OutputView.requestMoney();
        return retry(()->Parser.parseMoney(InputView.readInput()));
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


