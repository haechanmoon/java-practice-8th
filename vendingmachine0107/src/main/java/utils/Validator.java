package utils;

public class Validator {
    private static final String REGEX = "\\d+";

    public static void validateUnit(int money) {
        if((money%1000!=0)||money==0){
            throw new IllegalArgumentException(Messages.ERROR_PRICE_UNIT);
        }
    }

    public static void validateIsDigit(String input) {
        if(!input.matches(REGEX)){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }

    public static void validateIsBlank(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_IS_BLANK);
        }
    }
}
