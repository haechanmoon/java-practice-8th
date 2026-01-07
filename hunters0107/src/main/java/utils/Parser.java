package utils;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<String> parseNames(String input) {
        List<String> names = new ArrayList<>();
        for(String name : input.split(",")){
            Validator.validateNameBlank(name);
            names.add(name);
        }
        return names;
    }

    public static Integer parseSize(String input) {
        Validator.validateIsDigit(input);
        return Integer.parseInt(input);
    }
}
