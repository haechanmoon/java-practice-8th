package utils;

public class Validator {
    public static void validateIsBlank(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.IS_BLANK);
        }
    }
}
