package domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Messages;

class ParserTest {

    @Test
    @DisplayName("(예외) 숫자형태가 아닌값이 왔을 때")
    void 숫자형태가_아닌값이_왔을_때() {
        String input = "2f";

        assertThatThrownBy(() -> Parser.getNumber(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_NOT_DIGIT);
    }

}