package utils;

public class Validator {
    public static void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(Messages.ERROR_TOO_LONG_NAME);
        }
    }
}
