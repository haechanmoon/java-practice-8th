package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.EnumMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StatisticsTest {

    @Test
    @DisplayName("결과가 수익률로 잘 나오는지")
    void 결과가_수익률로_잘_나오는지(){
        int money = 10000;
        Map<Rank, Integer> fake = new EnumMap<>(Rank.class);
        fake.put(Rank.FIFTH,1);
        Statistics statistics = new Statistics(fake);

        double ratio = statistics.calculateRate(money);

        assertThat(ratio).isEqualTo(50);

    }

}