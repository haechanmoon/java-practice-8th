package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public static int parseMoney(String input) {
        return Integer.parseInt(input);
    }

    public static List<Integer> parseNumbers(String input) {
        List<String> numberStr = new ArrayList<>(Arrays.asList(input.split(",")));
        List<Integer> numberInt = new ArrayList<>();
        for (String val : numberStr) {
            numberInt.add(Integer.parseInt(val));
        }
        return numberInt;
    }
}
