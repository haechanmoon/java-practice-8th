package utils;

public class Validator {
    public static void validateNameLength(String name) {
        if(name.length()>5){
            throw new IllegalArgumentException(Messages.ERROR_NAME_LENGTH);
        }
    }

    public static void validateNameBlank(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_NAME_LENGTH);
        }
    }

    public static void validateIsBlank(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_IS_BLANK);
        }
    }

}
