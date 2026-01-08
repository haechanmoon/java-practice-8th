package domain;

import java.util.List;
import utils.Validator;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        Validator.validateNumberSize(numbers);
        Validator.validateNumberDuplicated(numbers);
        Validator.validateNumberRange(numbers);
        this.numbers = numbers;
    }



    // TODO: 추가 기능 구현
}
