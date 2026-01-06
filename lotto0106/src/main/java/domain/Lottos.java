package domain;

import java.util.List;
import java.util.Map;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public Map<Rank, Integer> result(WinningNumbers winningNumbers){
        Map<Rank, Integer> resultMap = Rank.mapInit();
        for(Lotto lotto : lottos){
            Rank rank = Rank.valueOf(winningNumbers.matchCount(lotto), winningNumbers.matchBonus(lotto));
            resultMap.put(rank, resultMap.getOrDefault(rank, 0)+1);
        }
        return resultMap;
    }

}
