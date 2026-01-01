package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ResultTest {

    @Test
    @DisplayName("3스트라이크일 때 문자열 확인")
    void 쓰리스트라이크일_때(){
        Result result = new Result(3,0);

        assertThat(result.convertResult()).contains("3스트라이크");
    }

    @Test
    @DisplayName("아무것도 없을 때 낫싱을 잘 출력하는지")
    void 낫싱일_때(){
        Result result = new Result(0,0);

        assertThat(result.convertResult()).contains("낫싱");
    }

}