package domain;

import java.util.List;
import java.util.Map;
import utils.Validator;

public class WinningNumbers {

    private final List<Integer> winNums;

    public WinningNumbers(List<Integer> winNums) {
        Validator.validateRange(winNums);
        Validator.validateDuplicated(winNums);
        Validator.validateSize(winNums);
        this.winNums = winNums;
    }

    public Map<Rank, Integer> calculate(Lottos lottos, int bonus){

    }

}
