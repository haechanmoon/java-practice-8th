package utils;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static int parseMoney(String input){
        Validator.validateIsDigit(input);
        return Integer.parseInt(input);
    }

    public static List<Integer> parseNumbers(String input){
        List<Integer> numbers = new ArrayList<>();
        for(String val : input.split(",")){
            Validator.validateIsDigit(val);
            numbers.add(Integer.parseInt(val));
        }
        return numbers;
    }

    public static int parseBonus(String input){
        Validator.validateIsDigit(input);
        return Integer.parseInt(input);
    }

}
