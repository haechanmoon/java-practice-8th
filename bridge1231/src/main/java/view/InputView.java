package view;

import camp.nextstep.edu.missionutils.Console;
import utils.Validator;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    public static int inputSize() {
        String input = Console.readLine();
        Validator.validateIsBlank(input);
        return Integer.parseInt(input);
    }

    public static String inputLetter() {
        String input = Console.readLine();
        Validator.validateIsBlank(input);
        return input;
    }

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return 0;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
