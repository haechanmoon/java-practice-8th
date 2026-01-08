package domain;

public class Hunter {

    private final int num;

    public Hunter(int generate) {
        this.num = generate;
    }

    public Monster meetMonster(){
        return Monster.matchMonster(num);
    }

}
