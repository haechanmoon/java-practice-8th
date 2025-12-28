package utils;

import java.util.List;

public class Validator {

    public static void validateCount(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_SIZE);
        }
    }

}
