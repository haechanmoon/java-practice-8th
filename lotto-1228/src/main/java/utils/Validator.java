package utils;

import java.util.HashSet;
import java.util.List;

public class Validator {

    public static void validateCount(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_SIZE);
        }
    }

    public static void validateRange(List<Integer> numbers) {
        for (Integer val : numbers) {
            if (val > 45 || val < 1) {
                throw new IllegalArgumentException(Messages.ERROR_RANGE_OUT);
            }
        }
    }

    public static void validateDuplicated(List<Integer> numbers) {
        HashSet<Integer> validateBoard = new HashSet<>(numbers);
        if (validateBoard.size() != numbers.size()) {
            throw new IllegalArgumentException(Messages.ERROR_NUMBER_DUPLICATED);
        }
    }

    public static void validateBonus(List<Integer> winNums, int bonus) {
        if (winNums.contains(bonus)) {
            throw new IllegalArgumentException(Messages.ERROR_ALREADY_BONUS);
        }
    }

    public static void validateIsDigit(String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }
}
