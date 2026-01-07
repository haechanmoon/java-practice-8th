package domain;

import utils.Validator;

public class Hunter {

    private static final int TREASURE_MIN_NUM = 6;
    private static final int TREASURE_MAX_NUM = 8;
    private final String name;
    private int stamina;
    private int gold;

    public Hunter(String name) {
        Validator.validateNameLength(name);
        this.name = name;
        this.stamina = 100;
        this.gold = 0;
    }

    public void go(int random){
        Round round = Round.matchRound(random);
        this.stamina += round.getStaminaChange();
        if(random>=TREASURE_MIN_NUM&&random<=TREASURE_MAX_NUM){
            this.gold +=100;
        }
    }

    public boolean isAlive(){
        if(stamina>0){
            return true;
        }
        this.gold =0;
        return false;
    }

    public int getGold(){
        return this.gold;
    }


}
