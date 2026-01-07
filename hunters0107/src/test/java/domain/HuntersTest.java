package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HuntersTest {

    @Test
    @DisplayName("헌터들이 자신의 체력관리가 잘 되는지.")
    void 헌터들_상태출력(){
        NumberGenerator testGenerator = new TestNumberGenerator(List.of(0,0));
        Hunter woni = new Hunter("woni");
        Hunter pobi = new Hunter("pobi");

        Hunters hunters = new Hunters(List.of(woni,pobi));
        assertThat(hunters.huntersGo(testGenerator.generate()))
                .contains("woni: 함정 (체력: 80)")
                .contains("pobi: 함정 (체력: 80)");
    }

}