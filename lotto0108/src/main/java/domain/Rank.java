package domain;

public enum Rank {

    MISS(0, 0),
    FIFTH(3, 5000),
    FOURTH(4, 50000),
    THIRD(5, 1500000),
    SECOND(5, 30000000),
    FIRST(6, 2000000000);

    private final int matchCount;
    private final int prize;


    Rank(int matchCount, int prize) {
        this.matchCount = matchCount;
        this.prize = prize;
    }

    public static Rank matchRank(int matchCount, boolean bonus) {

        if (matchCount < 3) {
            return MISS;
        }
        if (matchCount==5&&bonus){
            return SECOND;
        }
        for(Rank rank : Rank.values()){
            if(rank.matchCount==matchCount){
                return rank;
            }
        }
        return MISS;
    }

    public int getPrize() {
        return prize;
    }
    public int getMatchCount(){
        return matchCount;
    }
}
