package domain;

import java.util.List;

public class Calculator {

    private final List<Integer> numbers;

    public Calculator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sum() {
        int result = 0;
        for (Integer val : numbers) {
            result += val;
        }
        return result;
    }


}
