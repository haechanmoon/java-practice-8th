package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Messages;

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
    @DisplayName("(예외) 번호가 6개가 아닐 때")
    void 번호가_6개가_아닐_때() {
        assertThatThrownBy(() -> new WinningNumbers(List.of(1, 2, 3, 4, 5)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_NOT_SIZE);
    }

    @Test
    @DisplayName("(예외) 숫자 범위가 1-45가 아닐 때")
    void 숫자_범위가_1부터_45가_아닐_때() {
        assertThatThrownBy(() -> new WinningNumbers(List.of(1, 2, 3, 4, 5, 46)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_RANGE_OUT);
    }

    @Test
    @DisplayName("(예외) 중복된 숫자가 있을 때")
    void 중복된_숫자가_있을_때() {
        assertThatThrownBy(() -> new WinningNumbers(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NUMBER_DUPLICATED);
    }

}