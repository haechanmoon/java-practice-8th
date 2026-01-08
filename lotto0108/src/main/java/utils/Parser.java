package utils;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static Integer parseMoney(String input) {
        Validator.validateIsDigit(input);
        int money =  Integer.parseInt(input);
        Validator.validateIsLottoUnit(money);
        return money;
    }

    public static List<Integer> parseNumbers(String input) {
        List<Integer> winNums = new ArrayList<>();
        for(String num : input.split(",")){
            Validator.validateIsDigit(num);
            winNums.add(Integer.parseInt(num));
        }
        return winNums;
    }

    public static Integer parseBonus(String input) {
        Validator.validateIsDigit(input);
        return Integer.parseInt(input);
    }
}
