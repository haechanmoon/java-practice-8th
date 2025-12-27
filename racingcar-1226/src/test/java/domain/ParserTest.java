package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Messages;

class ParserTest {

    @Test
    @DisplayName("자동차 이름 분리 확인")
    void 자동차_이름_분리_확인() {
        String input = "pobi, bobo, tart";
        Parser parser = new Parser(input);

        assertThat(parser.splitInput())
                .contains("pobi")
                .contains("pobi", "bobo");
    }

    @Test
    @DisplayName("(예외) 빈값 입력 시")
    void 반값_입력_시() {
        String input = "";
        assertThatThrownBy(() -> new Parser(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_BLANK);
    }

}