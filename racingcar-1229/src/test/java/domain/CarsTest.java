package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    @DisplayName("자동차들 이름과 위치 출력 확인")
    void 자동차들_이름과_위치_출력_확인() {
        Car pobi = new Car("pobi");
        Car navi = new Car("navi");

        pobi.go(4);
        pobi.go(4);
        navi.go(1);
        navi.go(3);

        Cars cars = new Cars(List.of(pobi, navi));

        assertThat(cars.carsPosition()).isEqualTo("pobi : --\nnavi : \n");
    }

}