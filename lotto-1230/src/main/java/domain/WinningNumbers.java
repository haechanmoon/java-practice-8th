package domain;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import utils.Validator;

public class WinningNumbers {

    private final List<Integer> winNums;

    public WinningNumbers(List<Integer> winNums) {
        Validator.validateSize(winNums);
        Validator.validateDuplicated(winNums);
        Validator.validateRange(winNums);
        this.winNums = winNums;
    }

    public int matchLotto(Lotto lotto) {
        return lotto.matchWinningNumbers(winNums);
    }//이게 필요한건가? 일단 보류

    public boolean matchBonus(int bonus) {
        return winNums.contains(bonus);
    }

    public Map<Rank, Integer> getResult(Lottos lottos, int bonus) {
        Map<Rank, Integer> result = new EnumMap<>(Rank.class);
        for (Rank rank : Rank.values()) {
            result.put(rank, 0);
        }
        for (Lotto lotto : lottos.getLottos()) {
            int matchCount = lotto.matchWinningNumbers(winNums);
            boolean matchBonus = lotto.matchBonusNumber(bonus);
            Rank rank = Rank.valueOf(matchCount, matchBonus);
            result.put(rank, result.get(rank) + 1);
        }

        return result;

    }

}