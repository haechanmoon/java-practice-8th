package domain;

import java.util.List;
import utils.Messages;

public enum Round {

    PITFALL(List.of(0,1,2),-20),
    MONSTER(List.of(3,4,5),-50),
    TREASURE(List.of(6,7,8),0),
    REST(List.of(9),20)
    ;

    private final List<Integer> random;
    private final int staminaChange;


    Round(List<Integer> random, int staminaChange) {
        this.random = random;
        this.staminaChange = staminaChange;
    }

    public static Round matchRound(int random){
        for(Round round : Round.values()){
            if(round.random.contains(random)){
                return round;
            }
        }
        throw new IllegalArgumentException(Messages.ERROR_NOT_STATE);
    }


    public int getStaminaChange() {
        return staminaChange;
    }
}
