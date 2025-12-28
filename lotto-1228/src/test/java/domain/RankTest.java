package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RankTest {

    @Test
    @DisplayName("번호와 맞는 등수 확인")
    void 번호와_맞는_등수_확인() {
        List<Integer> winNums = List.of(1, 2, 3, 4, 5, 6);
        int bonus = 10;
        Lotto lotto = new Lotto(List.of(1, 2, 3, 7, 8, 9));

        Rank rank = Rank.valueOf(lotto, winNums, bonus);

        assertThat(rank).isEqualTo(Rank.FIFTH);
    }
}