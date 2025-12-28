package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.EnumMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinningPrizeTest {

    @Test
    @DisplayName("수익률 확인")
    void 수익률_확인() {
        Map<Rank, Integer> result = new EnumMap<>(Rank.class);

        for (Rank rank : Rank.values()) {
            result.put(rank, 0);
        }
        int money = 2000;

        result.put(Rank.FIFTH, 1);
        WinningPrize prize = new WinningPrize(result);
        double totalRatio = prize.prizeRatio(money);

        assertThat(totalRatio).isEqualTo(250);

    }
}