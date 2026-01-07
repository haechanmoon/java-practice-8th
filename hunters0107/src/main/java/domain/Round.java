package domain;

import java.util.List;
import utils.Messages;

public enum Round {

    PITFALL(List.of(0,1,2),-20,"함정"),
    MONSTER(List.of(3,4,5),-50,"몬스터 만남"),
    TREASURE(List.of(6,7,8),0, "보물 획득 (+100G)"),
    REST(List.of(9),20, "휴식")
    ;

    private final List<Integer> random;
    private final int staminaChange;
    private final String meet;


    Round(List<Integer> random, int staminaChange, String meet) {
        this.random = random;
        this.staminaChange = staminaChange;
        this.meet = meet;
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

    public String getMeet(){
        return meet;
    }
}
