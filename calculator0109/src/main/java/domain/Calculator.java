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
            String realInput = input.substring(input.indexOf("n")+1);
            for(String number : realInput.split(delimiter)){
                Validator.validateIsDigit(number);
                numbers.add(Integer.parseInt(number));
            }
            return numbers;
        }
        for(String number : input.split("[,:]")){
            number = number.trim();
            Validator.validateIsDigit(number);
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }

    public boolean isStartCustom(){
        return input.startsWith("//");
    }

    public int sumNumbers(List<Integer> numbers){
        int total = 0;
        for(int num : numbers){
            total += num;
        }
        return total;
    }
}
