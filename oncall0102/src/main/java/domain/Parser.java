package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public static List<String> parseName(String input) {
        List<String> names = new ArrayList<>(Arrays.asList(input.split(",")));
        return names;
    }

    public static int parseMonth(String input) {
        String[] inputs = input.split(",");
        return Integer.parseInt(inputs[0]);
    }

    public static String parseDay(String input) {
        String[] inputs = input.split(",");
        return inputs[1];
    }
}
