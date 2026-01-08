package domain;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public List<String> lottoNumbers(){
        List<String> numbers = new ArrayList<>();
        for(Lotto lotto : lottos){
            numbers.add(lotto.toString());
        }
        return numbers;
    }

    public Map<Rank, Integer> initMap(){
        Map<Rank, Integer> initMap = new EnumMap<>(Rank.class);
        for(Rank rank : Rank.values()){
            initMap.put(rank,0);
        }
        return initMap;
    }

    public Map<Rank, Integer> calculateResult(WinningNumbers winningNumbers){
        Map<Rank, Integer> result = initMap();
        for(Lotto lotto : lottos){
            int count = winningNumbers.matchCount(lotto);
            boolean bonus = winningNumbers.matchBonus(lotto);
            Rank rank = Rank.matchRank(count, bonus);
            result.put(rank, result.getOrDefault(rank, 0)+1);
        }
        return result;
    }

}
