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
    private final List<Integer> winningNumbers;
    private final int bonusNumber;

    public LottoService(String money, String winningNumbers, String bonusNumber) {
        this.money = Parser.getNumber(money);
        Validator.validateMoneyUnit(this.money);
        this.winningNumbers = Parser.getWinningNumbers(winningNumbers);
        this.bonusNumber = Parser.getNumber(bonusNumber);
    }

    private int lottoCount() {
        ;
        return money / 1000;
    }

    public Lottos generateLottos() {
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < lottoCount(); i++) {
            lottos.add(new Lotto(RandomGenerator.generateRandom()));
        }
        return new Lottos(lottos);
    }

    public String printLottos() {
        Lottos lottos = generateLottos();
        return lottos.toString();
    }

    public Map<Rank, Integer> getMap() {
        WinningNumbers winNums = new WinningNumbers(winningNumbers);
        return winNums.mapping(generateLottos(), bonusNumber);
    }

    public double resultRatio() {
        WinningPrize prize = new WinningPrize(getMap());
        return prize.prizeRatio(money);
    }
}
