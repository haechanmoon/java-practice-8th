package utils;

import java.util.HashSet;
import java.util.List;

public class Validator {
    private static final int LOTTO_NUMBER_SIZE = 6;

    public static void validateNumberSize(List<Integer> numbers) {
        if (numbers.size() != LOTTO_NUMBER_SIZE) {
            throw new IllegalArgumentException(Messages.ERROR_SIZE);
        }
    }

    public static void validateNumberDuplicated(List<Integer> numbers) {
        HashSet<Integer> validator = new HashSet<>(numbers);
        if(validator.size()!=numbers.size()){
            throw new IllegalArgumentException(Messages.ERROR_NUMBER_DUPLICATED);
        }
    }

    public static void validateNumberRange(List<Integer> numbers) {
        for(int number : numbers){
            if(number<1||number>45){
                throw new IllegalArgumentException(Messages.ERROR_NUMBER_RANGE);
            }
        }
    }

    public static void validateIsLottoUnit(int money) {
        if((money%1000!=0)||money ==0){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_LOTTO_UNIT);
        }
    }

    public static void validateBonusDuplicated(List<Integer> winNums, int bonus) {
        if(winNums.contains(bonus)){
            throw new IllegalArgumentException(Messages.ERROR_BONUS_ALREADY_IN);
        }
    }

    public static void validateInputBlank(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_INPUT_BLANK);
        }
    }

    public static void validateIsDigit(String input) {
        if(!input.matches("\\d+")){
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }
}
