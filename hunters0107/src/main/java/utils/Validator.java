package utils;

public class Validator {
    private static final int MAX_NAME_LENGTH = 5;

    public static void validateNameLength(String name) {
        if(name.length()>MAX_NAME_LENGTH){
            throw new IllegalArgumentException(Messages.ERROR_NAME_LENGTH);
        }
    }

    public static void validateNameBlank(String name) {
        if(name.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_NAME_BLANK);
        }
    }

    public static void validateIsEmpty(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_INPUT_BLANK);
        }
    }

    public static void validateIsDigit(String input) {
        if(!input.matches("\\d+")||input.equals("0")){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }
}
