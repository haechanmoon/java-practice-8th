package utils;

public class Validator {
    public static void validateIsDigit(String input) {
        if(!input.matches("\\d+")){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }

    public static void ValidateIsDuplicated(String input) {

    }

    public static void validateSize(String input) {
        if(input.length()!=3){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_SIZE);
        }
    }
}
