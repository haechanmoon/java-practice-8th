package domain;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    public int matchWinningNumbers(List<Integer> winNums) {
        int count = 0;
        for (Integer num : numbers) {
            if (winNums.contains(num)) {
                count++;
            }
        }
        return count;
    }

    public boolean matchBonusNumber(int bonus) {
        for (Integer num : numbers) {
            if (num == bonus) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return numbers.toString();
    }


}
