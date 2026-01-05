package utils;

import java.util.HashSet;
import java.util.List;

public class Validator {
    private static final int LOTTO_SIZE = 6;

    public static void validateSize(List<Integer> numbers) {
        if(numbers.size()!=LOTTO_SIZE){
            throw new IllegalArgumentException(Messages.ERROR_SIZE);
        }
    }

    public static void validateDuplicated(List<Integer> numbers) {
        HashSet<Integer> validator = new HashSet<>(numbers);
        if(validator.size()!=numbers.size()){
            throw new IllegalArgumentException(Messages.ERROR_DUPLICATED);
        }
    }

    public static void validateNumbersRange(List<Integer> numbers) {
        for(int val : numbers){
            if(val<1||val>45){
                throw new IllegalArgumentException(Messages.ERROR_RANGE_OVER);
            }
        }
    }

    public static void validateBonusRange(int bonus) {
        if(bonus<1||bonus>45){
            throw new IllegalArgumentException(Messages.ERROR_BONUS_RANGE);
        }
    }

    public static void validateBonusDuplicated(int bonus, List<Integer> winNums) {
        if(winNums.contains(bonus)){
            throw new IllegalArgumentException(Messages.ERROR_BONUS_DUPLICATED);
        }
    }

    public static void validateIsDigit(String input) {
        if(!input.matches("\\d+")){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }
}
