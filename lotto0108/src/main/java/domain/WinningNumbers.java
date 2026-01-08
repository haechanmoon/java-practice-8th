package domain;

import java.util.List;

public class WinningNumbers {

    private final List<Integer> winNums;

    public WinningNumbers(List<Integer> winNums) {
        this.winNums = winNums;
    }

    public int matchCount(Lotto lotto) {
        return lotto.matchNumbers(winNums);
    }
}
