package domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {

    private final int START_INCLUSIVE = 1;
    private final int END_INCLUSIVE = 45;
    private final int COUNT = 6;

    public List<Integer> generateRandom() {
        return new ArrayList<>(Randoms.pickUniqueNumbersInRange(START_INCLUSIVE, END_INCLUSIVE, COUNT));
    }
}
