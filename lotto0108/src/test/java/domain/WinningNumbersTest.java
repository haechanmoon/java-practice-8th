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

}