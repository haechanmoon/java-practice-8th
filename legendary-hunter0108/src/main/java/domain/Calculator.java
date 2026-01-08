package domain;

import java.util.Map;

public class Calculator {

    private final Map<Monster, Integer> result;


    public Calculator(Map<Monster, Integer> result) {
        this.result = result;
    }

    public double calculateRate(int money){
        double total = 0;
        for(Monster monster : Monster.values()){
            total += monster.getPrize() * result.getOrDefault(monster,0);
        }
        return total/money * 100;
    }
}
