package domain;

import java.util.ArrayList;
import java.util.List;

public class HunterGenerator {

    private final int TICKET_PRICE = 1000;

    private final int money;

    public HunterGenerator(int money) {
        this.money = money;
    }

    public Hunters generateHunter(NumberGenerator numberGenerator){
        List<Hunter> hunters = new ArrayList<>();
        for(int i =0 ; i<money/TICKET_PRICE;i++){
            Hunter hunter = new Hunter(numberGenerator.generate());
            hunters.add(hunter);
        }
        return new Hunters(hunters);
    }
}
