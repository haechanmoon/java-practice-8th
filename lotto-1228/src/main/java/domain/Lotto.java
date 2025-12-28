package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utils.Validator;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        Validator.validateCount(numbers);
        Validator.validateRange(numbers);
        Validator.validateDuplicated(numbers);
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        this.numbers = sortedNumbers;
    }

    public int matchCount(List<Integer> winningNumbers) {
        int count = 0;
        for (Integer num : winningNumbers) {
            if (numbers.contains(num)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return numbers.toString();
    }

    public boolean hasBonus(int bonus) {
        if (numbers.contains(bonus)) {
            return true;
        }
        return false;
    }

}
