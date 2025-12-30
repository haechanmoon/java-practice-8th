package domain;

import java.util.Map;

public class WinningPrize {

    public static double ratio(Map<Rank, Integer> result, int money) {
        int total = 0;
        for (Rank rank : Rank.values()) {
            total += rank.prize * result.getOrDefault(rank, 0);
        }
        return (double) total / money * 100;
    }
}
