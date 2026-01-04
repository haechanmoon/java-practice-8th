package utils;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static List<String> parseNames(String input){
        List<String> names = new ArrayList<>();
        for(String name : input.split(",")){
            names.add(name);
        }
        return names;
    }

    public static int parseTurns(String input) {
        Validator.validaIsDigit(input);
        int turn = Integer.parseInt(input);
        Validator.validateUpper(turn);
        return turn;
    }
}
