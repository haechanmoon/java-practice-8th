package view;

import camp.nextstep.edu.missionutils.Console;
import utils.Messages;

public class InputView {
    public static String readInput() {
        String input = Console.readLine();
        if(input.isBlank()){
            throw new IllegalArgumentException(Messages.ERROR_IS_BLANK);
        }
        return input;
    }
}
