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

    @Test
    @DisplayName("이름 구분 확인")
    void 이름_구분_확인() {
        String input = "pobi,woong,hong";
        List<String> splitName = Parser.parseNames(input);

        assertThat(splitName).contains("pobi").contains("woong").contains("hong");
    }

    @Test
    @DisplayName("(예외) 빈값을 입력 시")
    void 빈값을_입력_시() {
        String input = "";

        assertThatThrownBy(() -> Parser.parseNames(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_BLANK);
    }

    @Test
    @DisplayName("(예외) 각 이름이 5자 이하 아닐 시")
    void 각_이름이_5자_이하가_아닐_시() {
        String input = "pobi,woong,hongiii";

        assertThatThrownBy(() -> Parser.parseNames(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_TOO_LONG_NAME);
    }

    @Test
    @DisplayName("(예외) 이름이 중복되진 않았는지")
    void 이름이_중복되진_않는지() {
        String input = "pobi,woong,woong";

        assertThatThrownBy(() -> Parser.parseNames(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NAME_DUPLICATED);
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1", "2o"})
    @DisplayName("(예외) 횟수가 숫자형태인지")
    void 횟수가_숫자형태인지(String input) {
        assertThatThrownBy(() -> Parser.parserTurn(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_NOT_DIGIT);
    }
}