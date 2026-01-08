package domain;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Hunters {

    private final List<Hunter> hunters;

    public Hunters(List<Hunter> hunters) {
        this.hunters = hunters;
    }

    private Map<Monster, Integer> initMap(){
        Map<Monster, Integer> initMap = new EnumMap<>(Monster.class);
        for(Monster monster : Monster.values()){
            initMap.put(monster, 0);
        }
        return initMap;
    }

    public Map<Monster, Integer> calculateResult(){
        Map<Monster, Integer> result= initMap();
        for(Hunter hunter : hunters){
            Monster monster = hunter.meetMonster();
            result.put(monster, result.getOrDefault(monster,0)+1);
        }
        return result;
    }

}
