package domain;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Boxes {

    private final List<Box> boxes;

    public Boxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    public Map<Rank, Integer> calculateRanks(){
        Map<Rank, Integer> result = new EnumMap<>(Rank.class);
        for(Rank rank : Rank.values()){
            result.put(rank,0);
        }
        for(Box box : boxes){
            Rank rank = box.calculateRank();
            result.put(box.calculateRank(),result.getOrDefault(rank,0)+1);
        }

        return result;
    }

}
