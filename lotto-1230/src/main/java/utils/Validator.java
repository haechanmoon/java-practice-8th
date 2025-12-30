package utils;

import domain.WinningNumbers;
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

    public static void validateIsDigit(String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException(Messages.ERROR_NOT_DIGIT);
        }
    }

    public static void validateIsUnit(int money) {
        if ((money % 1000 != 0) || money == 0) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_UNIT);
        }
    }

    public static void validateBonusRange(int bonus, WinningNumbers winNums) {
        if (winNums.matchBonus(bonus)) {
            throw new IllegalArgumentException(Messages.ERROR_BONUS_DUPLICATED);
        }
    }
}
