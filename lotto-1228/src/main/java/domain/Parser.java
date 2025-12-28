package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class Parser {

    public int getNumber(String input) {
        Validator.validateIsDigit(input);
        return Integer.parseInt(input);
    }

    public List<Integer> getList(String input) {
        List<String> numberLetter = List.of(input.split(","));
        List<Integer> numbers = new ArrayList<>();
        for (String val : numberLetter) {
            numbers.add(Integer.parseInt(val));
        }
        return numbers;
    }

}
