package domain;

import java.util.Map;

public class WinningPrize {

    private final Map<Rank, Integer> result;

    public WinningPrize(Map<Rank, Integer> result) {
        this.result = result;
    }

    private int calculatePrize() {
        int totalPrize = 0;
        for (Rank rank : Rank.values()) {
            totalPrize += result.get(rank) * rank.getPrizeMoney();
        }
        return totalPrize;
    }

    public double prizeRatio(int money) {
        double ratio;
        ratio = (double) calculatePrize() / money;
        return ratio * 100;
    }
}
