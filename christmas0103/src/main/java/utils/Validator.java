package utils;

public class Validator {
    public static void validateIsBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(Messages.ERROR_IS_BLANK);
        }
    }

    public static void validateIsDigit(String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }

    public static void validateInRange(int date) {
        if (date > 31 || date < 1) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DATE);
        }
    }
}
