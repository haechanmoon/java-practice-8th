package domain;

public class Box {

    private final int number;

    public Box(int number) {
        this.number = number;
    }


    public Rank calculateRank(){
        return Rank.matchRank(number);
    }

}
