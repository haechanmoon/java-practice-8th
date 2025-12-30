package domain;

import java.util.List;

public class WinningNumbers {

    private final List<Integer> winNums;

    public WinningNumbers(List<Integer> winNums) {
        this.winNums = winNums;
    }

    public int matchLotto(Lotto lotto) {
        return lotto.matchWinningNumbers(winNums);
    }//이게 필요한건가? 일단 보류

    public boolean matchBonus(int bonus) {
        return winNums.contains(bonus);
    }

}