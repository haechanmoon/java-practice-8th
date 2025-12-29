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
}
