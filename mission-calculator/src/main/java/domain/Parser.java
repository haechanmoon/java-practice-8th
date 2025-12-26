package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class Parser {

    private final String input;

    public Parser(String input) {
        //Validator.validateIsDigit(input);
        this.input = input;
    }

    public List<Integer> parseInput() {
        List<Integer> numbers = new ArrayList<>();
        if (input.startsWith("//")) {
            return getIntegers(numbers);
        }
        extracted(input, "[,:]", numbers);
        return numbers;
    }

    private List<Integer> getIntegers(List<Integer> numbers) {
        String delimiter = input.substring(2, 3);
        String changed = input.substring(input.indexOf(delimiter) + 3);
        extracted(changed, delimiter, numbers);
        return numbers;
    }

    private void extracted(String changed, String delimiter, List<Integer> numbers) {
        for (String val : changed.split(delimiter)) {
            Validator.validateIsDigit(val);
            numbers.add(Integer.parseInt(val));
        }
    }
}
