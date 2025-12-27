package domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {

    private final int MIN = 0;
    private final int MAX = 9;

    public int generateRandom() {
        return Randoms.pickNumberInRange(MIN, MAX);
    }
}
