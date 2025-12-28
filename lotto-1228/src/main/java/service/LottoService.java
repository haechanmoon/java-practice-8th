package service;

import domain.Lotto;
import domain.Lottos;
import domain.Parser;
import domain.RandomGenerator;
import domain.Rank;
import domain.WinningNumbers;
import domain.WinningPrize;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import utils.Validator;

public class LottoService {

    private final int money;
    private final Lottos lottos;

    public LottoService(final String money) {
        this.money = Parser.getNumber(money);
        Validator.validateMoneyUnit(this.money);
        this.lottos = generateLottos();
    }

    public int lottoCount() {
        return money / 1000;
    }

    private Lottos generateLottos() {
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < lottoCount(); i++) {
            lottos.add(new Lotto(RandomGenerator.generateRandom()));
        }
        return new Lottos(lottos);
    }

    public String printLottos() {
        return lottos.toString();
    }

    public Map<Rank, Integer> getMap(String winningNumbersStr, String bonusNumberStr) {
        List<Integer> winningNumbers = Parser.getWinningNumbers(winningNumbersStr);
        int bonusNumber = Parser.getNumber(bonusNumberStr);
        WinningNumbers winNums = new WinningNumbers(winningNumbers);
        return winNums.mapping(lottos, bonusNumber);
    }

    public double resultRatio(Map<Rank, Integer> result) {
        WinningPrize prize = new WinningPrize(result);
        return prize.prizeRatio(money);
    }
}
