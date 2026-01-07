package utils;

public class Validator {
    public static void validateUnit(int money) {
        if((money%1000!=0)||money==0){
            throw new IllegalArgumentException(Messages.ERROR_PRICE_UNIT);
        }
    }
}
