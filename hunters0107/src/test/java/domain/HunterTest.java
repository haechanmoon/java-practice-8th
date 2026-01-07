package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Messages;

class HunterTest {

    @Test
    @DisplayName("헌터의 전진이 잘 출력되는지")
    void 전진() {
        NumberGenerator numberGenerator = new TestNumberGenerator(List.of(3));
        Hunter pobi = new Hunter("pobi");
        String result = pobi.go(numberGenerator.generate());

        assertThat(result).isEqualTo("pobi: 몬스터 만남 (체력: 50)");
    }

    @Test
    @DisplayName("이름이 6자 넘어갈 때")
    void 이름_길이_검증() {
        String name = "pobibibibi";

        assertThatThrownBy(() -> new Hunter(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NAME_LENGTH);
    }

    @Test
    @DisplayName("이름이 빈값일때")
    void 이름_빈값_검증(){
        String name = "";

        assertThatThrownBy(()->new Hunter(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NAME_BLANK);
    }
}