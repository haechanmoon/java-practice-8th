package utils;

import java.util.List;

public class Validator {
    private static final int LOTTO_NUMBER_SIZE = 6;

    public static void validateNumberSize(List<Integer> numbers) {
        if (numbers.size() != LOTTO_NUMBER_SIZE) {
            throw new IllegalArgumentException(Messages.ERROR_SIZE);
        }
    }
}
