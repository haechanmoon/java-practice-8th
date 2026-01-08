package domain;

import java.util.Map;

public class Statistics {

    private static final int PERCENT = 100;
    private final Map<Rank, Integer> result;

    public Statistics(Map<Rank, Integer> result) {
        this.result = result;
    }

    public double calculateRate(int money){
        double total = 0;
        for(Rank rank : Rank.values()){
            total+= result.getOrDefault(rank,0) * rank.getPrize();
        }
        return total/money * PERCENT;
    }
}
