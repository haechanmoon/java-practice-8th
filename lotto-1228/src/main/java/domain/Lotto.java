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
