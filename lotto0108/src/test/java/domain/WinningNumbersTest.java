package domain;

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


}