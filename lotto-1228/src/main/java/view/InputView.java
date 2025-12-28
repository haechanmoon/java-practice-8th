package view;

import camp.nextstep.edu.missionutils.Console;
import utils.Validator;

public class InputView {
    public static String inputRead() {
        String input = Console.readLine();
        Validator.validateIsBlank(input);
        return input;
    }

}
