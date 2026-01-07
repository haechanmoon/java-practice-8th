package utils;

public class Validator {
    public static void validateUnit(int money) {
        if((money%1000!=0)||money==0){
            throw new IllegalArgumentException(Messages.ERROR_PRICE_UNIT);
        }
    }

    public static void validateIsDigit(String input) {
        if(!input.matches("\\d+")){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }
}
