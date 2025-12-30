package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RankTest {

    @Test
    @DisplayName("등수 잘 나오는지 확인")
    void 등수_확인() {
        int matchCount = 3;
        boolean matchBonus = true;
        Rank rank = Rank.valueOf(matchCount, matchBonus);

        assertThat(rank).isEqualTo(Rank.FIFTH);
    }
}