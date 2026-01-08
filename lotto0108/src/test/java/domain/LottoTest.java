package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import utils.Messages;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @Test
    void 로또_번호의_개수가_6개가_넘어가면_예외가_발생한다() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void 로또_번호에_중복된_숫자가_있으면_예외가_발생한다() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName(" (예외) 번호가 범위를 넘어설 때")
    void 번호_범위_검사(){
        assertThatThrownBy(()->new Lotto(List.of(1,2,3,46,45,4)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NUMBER_RANGE);
    }

    @Test
    @DisplayName("자신의 번호와 당첨번호가 잘 매칭 되는지")
    void 로또번호와_당첨번호의_매칭개수(){
        Lotto lotto = new Lotto(List.of(1,2,3,4,5,6));
        List<Integer> winningNumbers = List.of(1,2,3,7,8,9);

        int count = lotto.matchNumbers(winningNumbers);

        assertThat(count).isEqualTo(3);
    }
}
