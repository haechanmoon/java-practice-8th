package domain;

import java.util.List;

public class WinningNumbers {

    private final List<Integer> winNums;
    private final int bonus;

    public WinningNumbers(List<Integer> winNums, int bonus) {
        this.winNums = winNums;
        this.bonus = bonus;
    }

    public int matchCount(Lotto lotto) {
        return lotto.matchNumbers(winNums);
    }

    public boolean matchBonus(Lotto lotto){
        return lotto.matchBonus(bonus);
    }
}
