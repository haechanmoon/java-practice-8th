package domain;

import java.util.Collections;
import java.util.List;
import utils.Validator;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        Collections.sort(numbers);
        Validator.validateSize(numbers);
        Validator.validateDuplicated(numbers);
        Validator.validateRange(numbers);
        this.numbers = numbers;
    }

    public int checkCount(List<Integer> numbers){
        int count = 0;
        for(int num : this.numbers){
            if(numbers.contains(num)){
                count++;
            }
        }
        return count;
    }

    public boolean checkBonus(int bonus){
        return this.numbers.contains(bonus);
    }

    public String toString(){
        return this.numbers.toString();
    }

}
