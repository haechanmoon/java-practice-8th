package utils;

import java.util.HashSet;
import java.util.List;

public class Validator {
    public static void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(Messages.ERROR_TOO_LONG_NAME);
        }
    }

    public static void validatorDuplicate(List<String> names) {
        HashSet<String> validator = new HashSet<>(names);
        if (validator.size() != names.size()) {
            throw new IllegalArgumentException(Messages.ERROR_NAME_DUPLICATED);
        }
    }

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
}
