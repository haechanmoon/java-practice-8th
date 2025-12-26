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

    @Test
    @DisplayName("위치 출력 기능 확인")
    void 위치_출력_기능() {
        Car pobi = new Car("pobi");
        Car lexi = new Car("lexi");

        pobi.go(4);
        pobi.go(4);
        pobi.go(4);

        lexi.go(2);
        lexi.go(2);
        lexi.go(4);

        assertThat(pobi.currentPosition()).isEqualTo("pobi : ---");
        assertThat(lexi.currentPosition()).isEqualTo("lexi : -");
    }

}