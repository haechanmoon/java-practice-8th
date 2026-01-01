package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class Parser {


    public static List<Integer> convertString(String input){
        Validator.validateIsDigit(input);
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0 ; i<input.length();i++){
            int num = input.charAt(i)-'0';
            numbers.add(num);
        }
        return numbers;
    }




}
