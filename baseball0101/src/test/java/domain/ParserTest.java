package domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Messages;

class ParserTest {

    @Test
    @DisplayName(("(예외) 입력값이 숫자형태가 아닐 때"))
    void 입력값_숫자형태_아닐_때(){
        String input = "1O3"; //영문 대문자 O

        assertThatThrownBy(()-> Parser.convertString(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_NOT_DIGIT);
    }

    @Test
    @DisplayName("(예외) 입력값이 4개일 때")
    void 입력값_사이즈_검사(){
        String input = "1234";

        assertThatThrownBy(()->Parser.convertString(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_NOT_SIZE);
    }

}