package utils;

public class Validator {
    private static final int MAX_NAME_LENGTH = 5;

    public static void validateNameLength(String name) {
        if(name.length()>MAX_NAME_LENGTH){
            throw new IllegalArgumentException(Messages.ERROR_NAME_LENGTH);
        }
    }
}
