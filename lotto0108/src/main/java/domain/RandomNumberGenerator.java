package domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomNumberGenerator implements NumberGenerator{

    private static final int START = 1;
    private static final int END = 45;
    private static final int COUNT = 6;

    @Override
    public List<Integer> generate(){
        return Randoms.pickUniqueNumbersInRange(START,END,COUNT);
    }
}
