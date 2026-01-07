package domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator{
    private static final int START = 1;
    private static final int END = 100;

    @Override
    public int generate(){
        return Randoms.pickNumberInRange(START,END);
    }
}
