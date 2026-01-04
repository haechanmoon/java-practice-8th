package utils;

import java.util.HashSet;
import java.util.List;

public class Validator {
    public static void validateSize(List<Integer> numbers) {
        if(numbers.size()>6){
            throw new IllegalArgumentException(Messages.ERROR_SIZE);
        }
    }

    public static void validateDuplicated(List<Integer> numbers) {
        HashSet<Integer> validator = new HashSet<>(numbers);
        if(validator.size()!=numbers.size()){
            throw new IllegalArgumentException(Messages.ERROR_DUPLICATED);
        }
    }

    public static void validateRange(List<Integer> numbers) {
        for(int val : numbers){
            if(val<1||val>45){
                throw new IllegalArgumentException(Messages.ERROR_RANGE_OUT);
            }
        }
    }
}
