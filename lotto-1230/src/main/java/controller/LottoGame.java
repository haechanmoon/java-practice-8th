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
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class LottoGame {

    public void start() {

        Lottos lottos = generateLottos();

        //당첨번호와 보너스 번호를 기반으로 당첨 통계를 낸다.
        Map<Rank, Integer> result = new EnumMap<>(Rank.class);
        result = calculateResult(lottos);

        //수익률을 구한다.
        double ratio = WinningPrize.ratio(result, lottos.lottosSize());
        OutputView.printRatio(ratio);

    }

    private Map<Rank, Integer> calculateResult(Lottos lottos) {
        OutputView.printLotto(lottos.lottosToString());
        OutputView.requestWinningNumbers();
        WinningNumbers winNums = new WinningNumbers(Parser.parseNumbers(InputView.getInput()));
        OutputView.requestBonusNumber();
        int bonus = Parser.parseBonus(InputView.getInput());
        return winNums.getResult(lottos, bonus);
    }

    private Lottos generateLottos() {
        while (true) {
            try {
                OutputView.requestMoney();
                int money = Parser.parseMoney(InputView.getInput());
                List<Lotto> lottos = new ArrayList<>();
                for (int i = 0; i < money / 1000; i++) {
                    lottos.add(new Lotto(RandomGenerator.generateNumbers()));
                }
                return new Lottos(lottos);
            } catch (IllegalArgumentException e) {
                OutputView.printError(e.getMessage());
            }
        }
    }


}
