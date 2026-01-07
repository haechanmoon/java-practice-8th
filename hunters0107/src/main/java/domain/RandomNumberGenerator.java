package domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator{
    private static final int START = 0;
    private static final int END = 9;

    @Override
    public int generate(){
        return Randoms.pickNumberInRange(START,END);
    }
}
