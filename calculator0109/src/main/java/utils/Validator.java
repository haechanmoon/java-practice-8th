package utils;

public class Validator {
    public static void validateIsDigit(String number) {
        if (!number.matches("\\d+")) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }
}
