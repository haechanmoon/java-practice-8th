package domain;

import java.util.List;

public class Calculator {

    private final List<Integer> numbers;

    public Calculator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sum() {
        int result = 0;
        result = getResult(result);
        return result;
    }

    private int getResult(int result) {
        for (Integer val : numbers) {
            result += val;
        }
        return result;
    }


}
