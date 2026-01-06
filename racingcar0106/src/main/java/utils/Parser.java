package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    public static List<String> parseNames(String input) {
        List<String> names = new ArrayList<>(Arrays.asList(input.split(",")));
        Validator.validateNameDuplicated(names);
        return names;
    }

    public static int parseTurns(String input) {
        Validator.validateIsDigit(input);
        return Integer.parseInt(input);
    }
}
