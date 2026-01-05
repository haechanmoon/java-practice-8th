package domain;

import java.util.List;
import utils.Validator;

public class WinningNumbers {

    private final List<Integer> winNums;
    private final int bonus;

    public WinningNumbers(List<Integer> winNums, int bonus) {
        Validator.validateDuplicated(winNums);
        Validator.validateSize(winNums);
        Validator.validateNumbersRange(winNums);
        Validator.validateBonusRange(bonus);
        Validator.validateBonusDuplicated(bonus,winNums);
        this.winNums = winNums;
        this.bonus = bonus;
    }

    public int matchCount(Lotto lotto){
        return lotto.matchCount(winNums);
    }

    public boolean matchBonus(Lotto lotto){
        return lotto.matchBonus(bonus);
    }


}
