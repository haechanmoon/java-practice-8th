package utils;

import java.util.HashSet;
import java.util.List;

public class Validator {
    private static final int MAX_LENGTH = 5;
    private static final int MAX_COUNT = 35;

    public static void validateNameLength(List<String> names) {
        for (String name : names) {
            if (name.length() > MAX_LENGTH) {
                throw new IllegalArgumentException(Messages.ERROR_NAME_LENGTH);
            }
        }
    }

    public static void validateNameCount(List<String> names) {
        if (MAX_COUNT < names.size()) {
            throw new IllegalArgumentException(Messages.ERROR_MANY_PEOPLE);
        }
    }

    public static void validateNameDuplicated(List<String> names) {
        HashSet<String> checker = new HashSet<>(names);
        if (checker.size() != names.size()) {
            throw new IllegalArgumentException((Messages.ERROR_NAME_DUPLICATED));
        }
    }

    public static void validateBlankName(List<String> names) {
        for (String name : names) {
            if (name.isBlank()) {
                throw new IllegalArgumentException(Messages.ERROR_BLANK_NAME);
            }
        }
    }

    public static void validateIsBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(Messages.ERROR_IS_BLANK);
        }
    }
}
