package view;

import camp.nextstep.edu.missionutils.Console;
import utils.Validator;

public class InputView {
    public static String readInput() {
        String input = Console.readLine();
        Validator.validateInputBlank(input);
        return input;
    }
}
