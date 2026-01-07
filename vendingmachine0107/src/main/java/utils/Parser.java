package utils;

public class Parser {

    public static int parseMoney(String input){
        Validator.validateIsDigit(input);
        return Integer.parseInt(input);
    }
}
