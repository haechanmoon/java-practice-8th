package domain;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static List<String> parseNames(String input) {
        List<String> names = new ArrayList<>();
        String[] nameSet = input.split(",");
        for (String name : nameSet) {
            names.add(name);
        }
        return names;
    }
}
