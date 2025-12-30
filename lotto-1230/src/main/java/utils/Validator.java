package utils;

import java.util.HashSet;
import java.util.List;

public class Validator {
    public static void validateIsBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(Messages.ERROR_IS_BLANK);
        }
    }

    public static void validateSize(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(Messages.ERROR_SIZE);
        }
    }

    public static void validateDuplicated(List<Integer> numbers) {
        HashSet<Integer> validator = new HashSet<>(numbers);
        if (validator.size() != numbers.size()) {
            throw new IllegalArgumentException(Messages.ERROR_DUPLICATED);
        }
    }

    public static void validateRange(List<Integer> numbers) {
        for (Integer num : numbers) {
            if (num < 1 || num > 45) {
                throw new IllegalArgumentException(Messages.ERROR_RANGE_OUT);
            }
        }
    }
}
