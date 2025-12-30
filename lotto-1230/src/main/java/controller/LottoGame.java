package controller;

import View.InputView;
import View.OutputView;
import domain.Lotto;
import domain.Lottos;
import domain.Parser;
import domain.RandomGenerator;
import domain.Rank;
import domain.WinningNumbers;
import domain.WinningPrize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import utils.Validator;

public class LottoGame {

    public void start() {

        int money = getMoney();
        Lottos lottos = generateLottos(money);
        lottoPrint(lottos, money);

        //당첨번호와 보너스 번호를 기반으로 당첨 통계를 낸다.
        Map<Rank, Integer> result = calculateResult(lottos);
        OutputView.printStatistics(result);
        //수익률을 구한다.
        double ratio = WinningPrize.ratio(result, lottos.lottosSize());
        OutputView.printRatio(ratio);

    }

    private int getMoney() {
        while (true) {
            try {
                OutputView.requestMoney();
                return Parser.parseMoney(InputView.getInput());
            } catch (IllegalArgumentException e) {
                OutputView.printError(e.getMessage());
            }
        }
    }

    private void lottoPrint(Lottos lottos, int money) {
        OutputView.printLottoCount(money);
        OutputView.printLotto(lottos.lottosToString());
    }

    private Map<Rank, Integer> calculateResult(Lottos lottos) {

        OutputView.requestWinningNumbers();
        WinningNumbers winNums = new WinningNumbers(Parser.parseNumbers(InputView.getInput()));
        OutputView.requestBonusNumber();
        int bonus = Parser.parseBonus(InputView.getInput());
        Validator.validateBonusRange(bonus, winNums);
        return winNums.getResult(lottos, bonus);
    }

    private Lottos generateLottos(int money) {
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < money / 1000; i++) {
            List<Integer> numbers = new ArrayList<>(RandomGenerator.generateNumbers());
            Collections.sort(numbers);
            lottos.add(new Lotto(numbers));
        }
        return new Lottos(lottos);
    }

}
