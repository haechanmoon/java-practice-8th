package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    @DisplayName("전진 후 위치 확인")
    void 전진_후_위치_확인() {
        //given
        Car pobi = new Car("pobi");

        //when
        pobi.go(4);
        pobi.go(4);
        pobi.go(4);

        //then
        assertThat(pobi.getPosition()).isEqualTo(3);
    }

}