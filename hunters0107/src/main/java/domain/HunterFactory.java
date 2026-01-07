package domain;

import java.util.ArrayList;
import java.util.List;

public class HunterFactory {

    private final List<String> names;

    public HunterFactory(List<String> names) {
        this.names = names;
    }

    public Hunters generateHunters(){
        List<Hunter> hunters = new ArrayList<>();
        for(String name : names){
            hunters.add(new Hunter(name));
        }
        return new Hunters(hunters);
    }
}
