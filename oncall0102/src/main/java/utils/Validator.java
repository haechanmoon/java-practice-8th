package utils;

import java.util.List;

public class Validator {
    private static final int MAX_LENGTH = 5;

    public static void validateNameLength(List<String> names) {
        for (String name : names) {
            if (name.length() > MAX_LENGTH) {
                throw new IllegalArgumentException(Messages.ERROR_NAME_LENGTH);
            }
        }
    }
}
