package view;

import camp.nextstep.edu.missionutils.Console;
import utils.Validator;

public class InputView {
    public static String inputMoney() {
        String input = Console.readLine();
        Validator.validateIsBlank(input);
        return input;
    }

    public static String inputNumbers() {
        return Console.readLine();
    }

    public static String inputBonusNumber() {
        return Console.readLine();
    }
}
