package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ParserTest {

    @Test
    @DisplayName("이름 구분 확인")
    void 이름_구분_확인() {
        String input = "pobi,woong,hong";
        List<String> splitName = Parser.parseNames(input);

        assertThat(splitName).contains("pobi").contains("woong").contains("hong");
    }

}