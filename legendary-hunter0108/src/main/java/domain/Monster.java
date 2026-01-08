package domain;

public enum Monster {

    C(889,"슬라임",500),
    B(989,"오크 전사", 5000),
    A(999, "고대 골렘", 50000),
    S(1000,"레드 드레곤", 1000000)
    ;

    private final int num;
    private final String name;
    private final int prize;

    Monster(int num, String name, int prize) {
        this.num = num;
        this.name = name;
        this.prize = prize;
    }

    public static Monster matchMonster(int random){
        for(Monster monster : Monster.values()){
            if(random<monster.num){
                return monster;
            }
        }
        return S;
    }


    public String getName() {
        return name;
    }

    public int getPrize() {
        return prize;
    }
}
