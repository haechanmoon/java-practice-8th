package domain;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class WinningNumbers {

    private final List<Integer> winNums;

    public WinningNumbers(List<Integer> winNums) {
        this.winNums = winNums;
    }

    public int matchCount(Lotto lotto) {
        return lotto.matchCount(winNums);
    }

    public boolean matchBonus(Lotto lotto, int bonus) {
        return lotto.hasBonus(bonus);
    }

    public Map<Rank, Integer> mapping(Lottos lottos, int bonus) {
        Map<Rank, Integer> result = new EnumMap<>(Rank.class);
        for (Rank rank : Rank.values()) {
            result.getOrDefault(rank, 0);
        }
        for (Lotto lotto : lottos.getLottos()) {
            Rank rank = Rank.valueOf(lotto, winNums, bonus);
            result.put(rank, result.getOrDefault(rank, 0) + 1);
        }
        return result;
    }
}
