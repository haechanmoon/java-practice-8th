package domain;

public class Box {



    public Rank readRank(int num){
        return Rank.matchRank(num);
    }

}
