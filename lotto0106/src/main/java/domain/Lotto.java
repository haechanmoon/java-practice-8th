package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utils.Validator;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        Validator.validateSize(numbers);
        Validator.validateDuplicated(numbers);
        Validator.validateNumbersRange(numbers);
        List<Integer> copyNumbers = new ArrayList<>(numbers);
        Collections.sort(copyNumbers);
        this.numbers = copyNumbers;
    }

    public int matchCount(List<Integer> winNums){
        int count = 0;
        for(int val : this.numbers){
            if(winNums.contains(val)){
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

}
