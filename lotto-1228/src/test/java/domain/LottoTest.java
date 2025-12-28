package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.Messages;

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
    @DisplayName("당첨번호와 비교한 개수가 맞는지")
    void 당첨번호와_비교한_개수가_맞는지() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> winningNumbers = List.of(1, 2, 3, 7, 8, 9);
        Lotto lotto = new Lotto(numbers);

        assertThat(lotto.matchCount(winningNumbers))
                .isEqualTo(3);
    }

    @Test
    @DisplayName("로또 번호를 문자열로 바꾸기")
    void 로또_번호를_문자열_바꾸기() {
        List<Integer> numbers = List.of(1, 2, 3, 5, 6, 8);
        Lotto lotto = new Lotto(numbers);

        assertThat(lotto.toString()).isEqualTo("[1, 2, 3, 5, 6, 8]");
    }

    @ParameterizedTest(name = "보너스 번호가 {0}이면 결과는 {1}이어야 한다.")
    @CsvSource({
            "1, true",
            "2, true",
            "3, true",
            "4, true",
            "7, false",
            "11, false",
            "12, false"
    })
    void 보너스번호와_로또번호_매칭(int bonus, boolean expected) {
        Lotto lotto = new Lotto(List.of(1, 2, 3, 4, 5, 6));

        assertThat(lotto.hasBonus(bonus)).isEqualTo(expected);
    }

    @Test
    @DisplayName("(예외) 로또 숫자가 6개가 아닐 때")
    void 로또_숫자가_6개가_아닐_때() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        assertThatThrownBy(() -> new Lotto(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_NOT_SIZE);
    }
}
