package domain;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        Collections.sort(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    public int matchCount(List<Integer> winNums){
        int count = 0;
        for(int val : numbers){
            if(winNums.contains(val)){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString(){
        return numbers.toString();
    }

}
