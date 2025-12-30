package domain;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

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

    public Map<Rank, Integer> getResult(Lottos lottos, int bonus) {
        Map<Rank, Integer> result = new EnumMap<>(Rank.class);
        for (Rank rank : Rank.values()) {
            if (rank == Rank.MISS) {
                continue;
            }
            result.getOrDefault(rank, 0);
            for (Lotto lotto : lottos.getLottos()) {
                int matchCount = lotto.matchWinningNumbers(winNums);
                boolean matchBonus = lotto.matchBonusNumber(bonus);
                result.put(Rank.valueOf(matchCount, matchBonus), result.get(rank) + 1);
            }
            return result;
        }
        //각 로또가 몇등인지. 그리고 그 로또의 랭크를 추출. 아 여기 엄청오래걸렸네.

    }

}