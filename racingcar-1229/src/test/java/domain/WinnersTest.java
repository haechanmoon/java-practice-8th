package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinnersTest {

    @Test
    @DisplayName("공동 우승일 때 이름 출력 확인")
    void 공동_우승일_때_이름_출력_확인() {
        Car pobi = new Car("pobi");
        Car navi = new Car("navi");

        pobi.go(4);
        pobi.go(4);
        navi.go(5);
        navi.go(5);

        Winners winners = new Winners(List.of(pobi, navi));

        assertThat(winners.findWinner()).isEqualTo("pobi, navi");
    }

}