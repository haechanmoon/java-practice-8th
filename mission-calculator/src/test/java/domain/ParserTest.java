package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
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

    @Test
    @DisplayName("커스텀구분자가 규칙을 따르지 않았을 때")
    void 커스텀구분자_규칙_준수() {
        String input = "//;\\\n1;2;3";
        Parser parser = new Parser(input);

        assertThatThrownBy(parser::parseInput)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_CHECK_CUSTOM_RULE);
    }

    @Test
    @DisplayName("문자열이 잘 쪼개지는지 확인")
    void 문자열이_잘_쪼개지는지_확인() {
        //given
        String input = "//;\\n1;2;3;4;5";
        Parser parser = new Parser(input);

        //when
        List<Integer> numbers = parser.parseInput();

        //then
        assertThat(numbers).isEqualTo(List.of(1, 2, 3, 4, 5));
    }
}
