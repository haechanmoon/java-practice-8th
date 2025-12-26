package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("총 합이 맞는지 확인")
    void 총_합이_맞는지() {
        //given
        List<Integer> numbers = List.of(1, 2, 3, 4);

        //when
        Calculator calculator = new Calculator(numbers);

        //then
        assertThat(calculator.sum()).isEqualTo(10);
    }

}