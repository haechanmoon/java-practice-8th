package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    @DisplayName("전진후 이름과 위치가 잘 나오는지 확인")
    void 전진후_이름과_위치_확인() {
        Car pobi = new Car("pobi");
        pobi.go(4);
        pobi.go(4);
        pobi.go(4);
        assertThat(pobi.printPosition()).isEqualTo("pobi : ---");
    }


}