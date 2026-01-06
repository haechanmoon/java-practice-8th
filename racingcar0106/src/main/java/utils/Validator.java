package utils;

import java.util.HashSet;
import java.util.List;
import net.bytebuddy.pool.TypePool.Resolution.Illegal;

public class Validator {
    private static final String ZERO = "0";

    public static void validateNameLength(String name) {
        if(name.length()>5){
            throw new IllegalArgumentException(Messages.ERROR_NAME_LENGTH);
        }
    }

    public static void validateNameBlank(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_NAME_BLANK);
        }
    }

    public static void validateIsBlank(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_IS_BLANK);
        }
    }

    public static void validateNameDuplicated(List<String> names) {
        HashSet<String> validator = new HashSet<>(names);
        if(validator.size()!=names.size()){
            throw new IllegalArgumentException(Messages.ERROR_NAME_DUPLICATED);
        }
    }

    public static void validateIsDigit(String input) {
        if(!input.matches("\\d+")||input.equals(ZERO)){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }
}
