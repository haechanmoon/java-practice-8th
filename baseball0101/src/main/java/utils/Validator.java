package utils;

import java.util.HashSet;

public class Validator {
    public static void validateIsDigit(String input) {
        if(!input.matches("\\d+")){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }

    public static void ValidateIsDuplicated(String input) {
        HashSet<Character> validator = new HashSet<>();
        for(int i = 0 ; i<input.length();i++){
            validator.add(input.charAt(i));
        }
        if(validator.size()!=input.length()){
            throw new IllegalArgumentException(Messages.ERROR_NUMBER_DUPLICATED);
        }

    }

    public static void validateSize(String input) {
        if(input.length()!=3){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_SIZE);
        }
    }
}
