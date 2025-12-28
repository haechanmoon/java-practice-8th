package domain;

import java.util.List;

public enum Rank {

    MISS(0, 0),
    FIFTH(3, 5000),
    FOURTH(4, 50000),
    THIRD(5, 1500000),
    SECOND(5, 30000000),
    FIRST(6, 2000000000);

    private static final int FAIL_NUM = 3;
    private final int matchCount;
    private final int prizeMoney;

    Rank(int matchCount, int prizeMoney) {
        this.matchCount = matchCount;
        this.prizeMoney = prizeMoney;
    }

    public static Rank valueOf(Lotto lotto, List<Integer> winNum, int bonus) {
        if (lotto.matchCount(winNum) < FAIL_NUM) {
            return MISS;
        }

        for (Rank rank : Rank.values()) {
            if (rank.matchCount == lotto.matchCount(winNum) && rank.matchCount == 5) {
                if (lotto.hasBonus(bonus)) {
                    return SECOND;
                }
                return THIRD;
            }
            if (rank.matchCount == lotto.matchCount(winNum)) {
                return rank;
            }
        }
        return MISS;

        /*
        자. 일단. matchCount가 3미만인거는 접었어.
        일단. matchCount 가 낮아야한다말이야. 그치 ?
        일단 여기까지는 OK야.
        그 다음에 내가 어떻게 해야할까?
        자. 일단. 그건 Pass했어. 그 다음에 어떻게 할건데.
        여기 못뚫겠따. 지짜. 아니 이거 몇번을 반복했는데 도 ㅈㄴ 어렵네 슈발것
        천천히 한번 해보자. AI없이도 이제는 짤 수 있잖아.
        나에게 맞는 Rank를 출력하는거야. 그럼 뭐가있어야해?
        WinningNumbers 에서 lotto와 비교해서 맞는 당첨번호 개수를 출력해줄거아니냐?
        그럼 거기서 출력하면될것같은데?
        자. 그럼 WinningNumbers 에서 받았어. 그 다음엔 어떻게 해야하니?
        1. Rank rank에서 matchCount와 winning-matchCount를 비교해서
        2. 만약 그게 맞으면 rank를 출력해. 근데 그 때 5일때는 bonus검사도 해야돼!
        3. WinningNumbers 에서 발급해주는 bonus넘버도 boolean이true이면 seconde이고 false이면 third야.
        4. 나머지는 걍 Miss처리 ㄱㄱ;

        */
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public String getString() {
        if (this == SECOND) {
            return String.format(("%d개 일치, 보너스 볼 일치 (%,d원) - "), matchCount, prizeMoney);
        }
        return String.format(("%d개 일치 (%,d원) - "), matchCount, prizeMoney);
    }

}
