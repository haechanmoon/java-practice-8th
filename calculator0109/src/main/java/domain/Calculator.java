package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class Calculator {

    private final String input;

    public Calculator(String input) {
        this.input = input;
    }

    public List<Integer> splitNumbers(){
        List<Integer> numbers = new ArrayList<>();
        if(isStartCustom()){
            String delimiter = input.substring(2,3);
            String realInput = input.substring(input.indexOf(delimiter)+2);
            for(String number : realInput.split(delimiter)){
                Validator.validateIsDigit(number);
                numbers.add(Integer.parseInt(number));
            }
        }
        for(String number : input.split("[,:]")){
            Validator.validateIsDigit(number);
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }

    public boolean isStartCustom(){
        return input.startsWith("//");
    }
}
