package domain;

public enum Rank {

    MISS(0, 0),
    FIFTH(3, 5000),
    FOURTH(4, 50000),
    THIRD(5, 1500000),
    SECOND(5, 30000000),
    FIRST(6, 2000000000);

    private final int matchCount;
    public final int prize;

    Rank(int matchCount, int prize) {
        this.matchCount = matchCount;
        this.prize = prize;
    }

//    public static Rank valueOf(Lotto lotto, WinningNumbers winNums, int bonus) {
//        for (Rank rank : Rank.values()) {
//            if (matchCount(lotto, winNums) < 3) {
//                return MISS;
//            }
//
//            if (rank.matchCount == matchCount(lotto, winNums)) {
//                if (rank.matchCount == 5 && lotto.matchBonusNumber(bonus)) {
//                    return SECOND;
//                }
//                return rank;
//            }
//        }
//        return MISS;
//    }

    private static int matchCount(Lotto lotto, WinningNumbers winNums) {
        return winNums.matchLotto(lotto);
    }

    public static Rank valueOf(int matchCount, boolean bonusMatch) {
        if (matchCount < 3) {
            return MISS;
        }
        for (Rank rank : Rank.values()) {
            if (rank.matchCount == matchCount && matchCount == 5) {
                return SECOND;
            }
            return rank;
        }
        return MISS;
    }


}
