package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    @DisplayName("우승자 확인")
    void 우승자_확인() {
        Car pobi = new Car("pobi");
        Car navi = new Car("navi");

        pobi.go(4);
        pobi.go(4);
        pobi.go(4);

        navi.go(1);
        navi.go(1);
        navi.go(4);

        List<Car> carNames = List.of(pobi, navi);
        Cars cars = new Cars(carNames);
        assertThat(cars.writeWinners()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("자동차들 N회 움직임시 위치 확인")
    void 자동차들_N회_움직임시_위치_확인() {
        Car pobi = new Car("pobi");
        Car navi = new Car("navi");
        List<Car> carTest = List.of(pobi, navi);
        Cars cars = new Cars(carTest);

        RandomGenerator generator = new RandomGenerator() {
            @Override
            public int generateRandom() {
                return 4;
            }
        };

        cars.runTurns(5, generator);

        assertThat(pobi.getPosition()).isEqualTo(5);
        assertThat(navi.getPosition()).isEqualTo(5);
    }
}