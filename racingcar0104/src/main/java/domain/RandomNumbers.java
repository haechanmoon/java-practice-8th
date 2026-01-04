package domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumbers implements Numbers{
    @Override
    public int generate(){
        return Randoms.pickNumberInRange(0,9);
    }
}
