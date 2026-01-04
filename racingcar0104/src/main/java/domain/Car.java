package domain;

import utils.Validator;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        name = name.trim();
        Validator.validateNameLength(name);
        Validator.validateIsBlank(name);
        this.name = name;
        position= 0 ;
    }

    public void go(Numbers numbers){
        if(4<=numbers.generate()){
            position++;
        }
    }

    public String currentPosition(){
        return name + " : "
                + "-".repeat(Math.max(0, position));
    }

    public int getPosition(){
        return position;
    }

    public String getName(){
        return name;
    }
}
