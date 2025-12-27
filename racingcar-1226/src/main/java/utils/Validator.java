package utils;

import java.util.HashSet;
import java.util.List;

public class Validator {
    private static final int SIZE_STANDARD = 5;

    public static void validateIsBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(Messages.ERROR_IS_BLANK);
        }
    }

    public static void validateLength(String name) {
        if (name.length() > SIZE_STANDARD) {
            throw new IllegalArgumentException(Messages.ERROR_NAME_LENGTH);
        }
    }

    public static void validateNameDuplicated(List<String> names) {
        HashSet<String> validateName = new HashSet<>(names);
        if (validateName.size() != names.size()) {
            throw new IllegalArgumentException(Messages.ERROR_NAME_DUPLICATED);
        }
    }


}
