package domain;

public enum Rank {

    MISS(69,0,"꽝"),
    THIRD(89,1000,"3등"),
    SECOND(99,5000,"2등"),
    FIRST(100,50000,"1등")
    ;

    private final int matchNum;
    private final int prize;
    private final String name;

    Rank(int matchNum, int prize, String name) {
        this.matchNum = matchNum;
        this.prize = prize;
        this.name = name;
    }

    public Rank matchRank(int num){
        for(Rank rank : Rank.values()){
           if(num<matchNum){
               return rank;
           }
        }
        return FIRST;
    }
}
