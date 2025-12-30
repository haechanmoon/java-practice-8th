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

    public Rank valueOf(Lotto lotto, WinningNumbers winNums, int bonus) {
        for (Rank rank : Rank.values()) {
            if (matchCount < 3) {
                return MISS;
            }

            if (rank.matchCount == winNums.matchLotto(lotto)) {
                if (rank.matchCount == 5 && lotto.matchBonusNumber(bonus)) {
                    return SECOND;
                }
                return rank;
            }
        }
        return MISS;
    } //들여쓰기 3줄 이상!! 확인해봐라!


}
