package domain;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import utils.Validator;

public class WinningNumbers {

    private final List<Integer> winNums;
    private final int bonus;

    public WinningNumbers(List<Integer> winNums, int bonus) {
        Validator.validateDuplicated(winNums);
        Validator.validateSize(winNums);
        Validator.validateNumbersRange(winNums);
        Validator.validateBonusRange(bonus);
        Validator.validateBonusDuplicated(bonus,winNums);
        this.winNums = winNums;
        this.bonus = bonus;
    }

    public int matchCount(Lotto lotto){
        return lotto.matchCount(winNums);
    }

    public boolean matchBonus(Lotto lotto){
        return lotto.matchBonus(bonus);
    }

    public Map<Rank, Integer> initMap(){
        Map<Rank, Integer> init = new EnumMap<>(Rank.class);
        for(Rank rank : Rank.values()){
            init.put(rank, 0);
        }
        return init;
    }

}


/*
public Map<Rank, Integer> mapping(Lottos lottos){
        Map<Rank, Integer> result = new EnumMap<>(Rank.class);
        for(Rank rank : Rank.values()){
            result.put(rank, 0);
        }

        for(Lotto lotto : lottos.getLottos()){
            Rank rank = Rank.valueOf(matchCount(lotto),matchBonus(lotto));
            result.put(rank,result.getOrDefault(rank,0)+1);
        }
        return result;
    }
 */