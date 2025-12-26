package utils;

public class Validator {


    public static void validateIsDigit(String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }

    public static void validateIsEmpty(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(Messages.ERROR_IS_BLANK);
        }
    }

    public static void validateCustom(String input) {
        if (!input.startsWith("\\n", 3)) {
            throw new IllegalArgumentException(Messages.ERROR_CHECK_CUSTOM_RULE);
        }
    }
}
