package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}