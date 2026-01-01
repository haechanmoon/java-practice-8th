package domain;

import java.util.List;

public class Computer {

    private final List<Integer> numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = numbers;
    }


    public Result checkNumbers(List<Integer> userNumbers){
        //자. 일단 userNumbers와 numbers를 비교. 그래서 값이 같으면 count증가.
        //거기서 일단 그 값중에 userNumbers와 numbers가 위치가 같으면 strike증가.ball개수는 count-strike; 이렇게 하면될듯
        int count = 0;
        int strike = 0;

        for(int val : userNumbers){
            if(numbers.contains(val)){
                count++;
            }
        }
        for(int i = 0;i<numbers.size();i++){
            if(userNumbers.get(i).equals(numbers.get(i))){
                strike++;
            }
        }
        int ball = count-strike;
        return new Result(strike,ball);
    }
}
