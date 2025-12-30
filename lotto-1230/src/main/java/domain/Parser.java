package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import utils.Validator;

public class Parser {

    public static int parseMoney(String input) {
        Validator.validateIsDigit(input);
        int money = Integer.parseInt(input);
        Validator.validateIsUnit(money);
        return money;
    }

    public static List<Integer> parseNumbers(String input) {
        List<String> numberStr = new ArrayList<>(Arrays.asList(input.split(",")));
        List<Integer> numberInt = new ArrayList<>();
        for (String val : numberStr) {
            Validator.validateIsDigit(val);
            numberInt.add(Integer.parseInt(val));
        }
        return numberInt;
    }

    public static int parseBonus(String input) {
        Validator.validateIsDigit(input);
        return Integer.parseInt(input);
    }
}
