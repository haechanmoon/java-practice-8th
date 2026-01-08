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

    public int matchNumbers(List<Integer> numbers){
        int count =0;
        for(int number : this.numbers){
            if (numbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    public boolean matchBonus(int bonus){
        return this.numbers.contains(bonus);
    }


    @Override
    public String toString(){
        return numbers.toString();
    }

    // TODO: 추가 기능 구현
}
