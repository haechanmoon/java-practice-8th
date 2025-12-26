package domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import utils.Messages;

class ParserTest {

    @ParameterizedTest
    @ValueSource(strings = {"1,2,3,f,5", "1f,1,2", "-1,2", "3p,1"})
    @DisplayName("숫자가 아닌 수가 들어갔을 때")
    void 숫자인지_검증(String input) {
        Parser parser = new Parser(input);

        assertThatThrownBy(parser::parseInput)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_NOT_DIGIT);

    }

    @Test
    @DisplayName("입력값이 빈 값일 때")
    void 입력값이_빈_값일_때() {
        String input = "";

        assertThatThrownBy(() -> new Parser(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_BLANK);
    }

    @Test
    @DisplayName("숫자가 빈 값일 때")
    void 숫자가_빈_값일_때() {
        String input = "1,,2,3,4,5";
        Parser parser = new Parser(input);

        assertThatThrownBy(parser::parseInput)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_BLANK);
    }
}
