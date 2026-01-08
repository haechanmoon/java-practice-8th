package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Messages;

class WinningNumbersTest {

    @Test
    @DisplayName("(예외) 당첨번호가 중복되었을 때")
    void 당첨번호_중복(){
        List<Integer> winNums = List.of(1,2,3,4,5,5);
        int bonus = 10;

        assertThatThrownBy(()-> new WinningNumbers(winNums, bonus))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NUMBER_DUPLICATED);
    }

    @Test
    @DisplayName("(예외) 당첨번호가 범위를 벗어났을 때")
    void 당첨번호가_범위를_벗어난_숫자_포함(){
        List<Integer> winNums = List.of(1,2,3,4,5,46);
        int bonus = 11;

        assertThatThrownBy(()-> new WinningNumbers(winNums, bonus))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NUMBER_RANGE);
    }

    @Test
    @DisplayName("(예외) 보너스 번호와 당첨번호가 중복되었을 때")
    void 당첨번호와_보너스번호_중복(){
        List<Integer> winNums = List.of(1,2,3,4,5,6);
        int bonus = 6;

        assertThatThrownBy(()-> new WinningNumbers(winNums, bonus))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_BONUS_ALREADY_IN);
    }

    @Test
    @DisplayName("로또 번호와 당첨번호가 잘 매칭되는지")
    void 로또번호와_당첨번호_매칭(){
        Lotto lotto = new Lotto(List.of(1,2,3,4,5,6));
        WinningNumbers winningNumbers = new WinningNumbers(List.of(1,2,3,4,5,7),6);

        int count = winningNumbers.matchCount(lotto);

        assertThat(count).isEqualTo(5);
    }

    @Test
    @DisplayName("로또 번호와 보너스 번호가 잘 매칭되는지")
    void 로또번호와_보너스번호_매칭(){
        Lotto lotto = new Lotto(List.of(1,2,3,4,5,6));
        WinningNumbers winningNumbers = new WinningNumbers(List.of(1,2,3,4,5,7),6);

        boolean bonus = winningNumbers.matchBonus(lotto);

        assertThat(bonus).isEqualTo(true);
    }


}