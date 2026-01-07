package domain;

import utils.Validator;

public class Hunter {

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
        //랜덤값을 받아서 그게 여기서 해야하나? if(0~2)이렇게?
        //Enum에게 받아오는게 아닌가?
        //그럼 Enum 얘는 뭐하는애이지? 그거부터 만들어볼까?
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
