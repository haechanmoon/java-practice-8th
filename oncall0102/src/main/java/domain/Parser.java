package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public static List<String> parseName(String input) {
        List<String> names = new ArrayList<>(Arrays.asList(input.split(",")));
        return names;
    }
}
