package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utils.Validator;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        Validator.validateNumberSize(numbers);
        Validator.validateNumberDuplicated(numbers);
        Validator.validateNumberRange(numbers);
        List<Integer> sortNumbers = new ArrayList<>(numbers);
        Collections.sort(sortNumbers);
        this.numbers = sortNumbers;
    }

    @Override
    public String toString(){
        return numbers.toString();
    }

    // TODO: 추가 기능 구현
}
