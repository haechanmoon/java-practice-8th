package domain;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private final String input;

    public Parser(String input) {
        this.input = input;
    }

    public List<String> parseInput() {
        List<String> names = new ArrayList<>();
        for (String name : input.split(",")) {
            names.add(name);
        }
        return names;
    }
}
