package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class Parser {

    private final String input;

    public Parser(String input) {
        Validator.validateIsBlank(input);
        this.input = input;
    }

    public List<String> splitInput() {
        List<String> names = new ArrayList<>();
        for (String name : input.split(",")) {
            Validator.validateLength(name.trim());
            names.add(name.trim());
        }
        return names;
    }
}
