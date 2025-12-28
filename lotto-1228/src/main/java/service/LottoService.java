package service;

import domain.Parser;
import java.util.List;

public class LottoService {

    private final int money;
    private final List<Integer> winningNumbers;
    private final int bonusNumber;

    public LottoService(String money, String winningNumbers, String bonusNumber) {
        this.money = Parser.getNumber(money);
        this.winningNumbers = Parser.getWinningNumbers(winningNumbers);
        this.bonusNumber = Parser.getNumber(bonusNumber);
    }
}
