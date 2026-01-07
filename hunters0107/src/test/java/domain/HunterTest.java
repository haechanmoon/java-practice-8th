package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HunterTest {

    @Test
    @DisplayName("헌터의 전진이 잘 출력되는지")
    void 전진(){
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Hunter pobi = new Hunter("pobi");
        String result = pobi.go(randomNumberGenerator.meetMonster());

        assertThat(result).isEqualTo("pobi: 몬스터 만남 (체력: 50)");
    }

}