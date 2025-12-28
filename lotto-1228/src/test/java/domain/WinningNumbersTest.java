package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinningNumbersTest {

    @Test
    @DisplayName("로또가 Rank와 잘 매칭 되는지")
    void 로또가_Rank와_매칭() {
        //given
        Lotto lotto1 = new Lotto(List.of(1, 2, 3, 4, 5, 6));
        Lotto lotto2 = new Lotto(List.of(1, 2, 3, 4, 5, 7));
        Lotto lotto3 = new Lotto(List.of(1, 2, 3, 4, 5, 8));
        WinningNumbers winNums = new WinningNumbers(List.of(1, 2, 3, 4, 7, 8));
        Lottos lottos = new Lottos(List.of(lotto1, lotto2, lotto3));
        int bonus = 22;

        //when
        Map<Rank, Integer> result = winNums.mapping(lottos, bonus);

        assertThat(result)
                .containsEntry(Rank.FOURTH, 1)
                .containsEntry(Rank.THIRD, 2);
    }

    @Test
    @DisplayName("")

}