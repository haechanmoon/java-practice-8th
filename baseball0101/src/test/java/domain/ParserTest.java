package domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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

    @ParameterizedTest
    @ValueSource(strings = {"3","4","5","6","0"})
    @DisplayName("(예외) 재시작 입력이 1과 2중 가 아닐 때")
    void 재시작_입력값_검사(String input){
        assertThatThrownBy(()->Parser.commandParse(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_NOT_COMMAND);
    }

    @Test
    @DisplayName("(예외) 숫자가 겹칠 때")
    void 숫자가_겹칠_때(){
        String input = "113";

        assertThatThrownBy(()->Parser.convertString(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NUMBER_DUPLICATED);
    }
}