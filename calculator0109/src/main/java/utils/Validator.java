package utils;

public class Validator {
    public static void validateIsDigit(String number) {
        if (!number.matches("\\d+")) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }

    public static void validateIsBlank(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_IS_EMPTY);
        }
    }
}
