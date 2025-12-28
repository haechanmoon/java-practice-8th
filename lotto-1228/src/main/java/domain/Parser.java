package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class Parser {

    public static int getNumber(String input) {
        Validator.validateIsDigit(input);
        return Integer.parseInt(input);
    }

    public static List<Integer> getWinningNumbers(String input) {
        List<String> numberLetter = List.of(input.split(","));
        List<Integer> numbers = new ArrayList<>();
        for (String val : numberLetter) {
            numbers.add(Integer.parseInt(val));
        }
        return numbers;
    }

}
