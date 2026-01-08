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
}
