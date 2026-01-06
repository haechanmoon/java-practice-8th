package domain;

import utils.Validator;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        Validator.validateNameLength(name);
        Validator.validateNameBlank(name);
        this.name = name;
        this.position = 0;
    }

    public void go(int num){
        position++;
    }

    public String currentPosition(){
        return name+" : "+"-".repeat(Math.max(0,position));
    }


}
