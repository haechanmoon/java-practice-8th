package domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator{
    private static final int START = 0;
    private static final int END = 9;

    @Override
    public int generate(){
        return Randoms.pickNumberInRange(START,END);
    }

    public int meetPitfall(){
        return 0;
    }

    public int meetMonster(){
        return 3;
    }

    public int meetTreasure(){
        return 6;
    }

    public int meetRest(){
        return 9;
    }

}
