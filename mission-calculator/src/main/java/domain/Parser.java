package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class Parser {

    private final String input;

    public Parser(String input) {
        Validator.validateIsEmpty(input);
        this.input = input;
    }

    public List<Integer> parseInput() {
        List<Integer> numbers = new ArrayList<>();
        if (input.startsWith("//")) {
            Validator.validateCustom(input);
            return getIntegers(numbers);
        }
        extracted(input, "[,:]", numbers);
        return numbers;
    }

    private List<Integer> getIntegers(List<Integer> numbers) {
        String delimiter = input.substring(2, 3);
        String changed = input.substring(input.indexOf("\\n") + 2);
        extracted(changed, delimiter, numbers);
        return numbers;
    }

    private void extracted(String changed, String delimiter, List<Integer> numbers) {
        for (String val : changed.trim().split(delimiter)) {
            Validator.validateIsEmpty(val);
            Validator.validateIsDigit(val);
            numbers.add(Integer.parseInt(val));
        }
    }
}
