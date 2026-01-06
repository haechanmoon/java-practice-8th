package domain;

import utils.Validator;

public class Car {

    private static final int GO_STANDARD = 4;
    private final String name;
    private int position;

    public Car(String name) {
        Validator.validateNameLength(name);
        Validator.validateNameBlank(name);
        this.name = name;
        this.position = 0;
    }

    public void go(int num){
        if(num>=GO_STANDARD) {
            position++;
        }
    }

    public String currentPosition(){
        return name+" : "+"-".repeat(Math.max(0,position));
    }

    public int isMaxPosition(int maxPosition){
        return Math.max(position, maxPosition);
    }

    public String winner(int maxPosition){
        if(maxPosition==position){
            return name;
        }
        return "";
    }


}
