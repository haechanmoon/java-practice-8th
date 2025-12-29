package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class Parser {

    public static List<String> parseNames(String input) {
        Validator.validateIsBlank(input);
        List<String> names = new ArrayList<>();
        String[] nameSet = input.split(",");
        for (String name : nameSet) {
            Validator.validateNameLength(name);
            names.add(name);
        }
        Validator.validatorDuplicate(names);
        return names;
    }

    public static int parserTurn(String input) {
        Validator.validateIsBlank(input);
        Validator.validateIsDigit(input);
        int turn = Integer.parseInt(input);

        return turn;
    }

}
