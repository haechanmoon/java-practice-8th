package utils;

import java.util.List;

public class Validator {
    private static final int LOTTO_SIZE = 6;

    public static void validateSize(List<Integer> numbers) {
        if(numbers.size()!=LOTTO_SIZE){
            throw new IllegalArgumentException(Messages.ERROR_SIZE);
        }
    }
}
