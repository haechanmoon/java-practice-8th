package view;

import camp.nextstep.edu.missionutils.Console;
import domain.Menu;
import java.util.EnumMap;
import java.util.Map;
import utils.Validator;

public class InputView {
    public static int inputDate() {
        String input = Console.readLine();
        Validator.validateIsBlank(input);
        Validator.validateIsDigit(input);
        int date = Integer.parseInt(input);
        Validator.validateInRange(date);
        return date;
    }

    public static Map<Menu, Integer> inputMenu() {

        String input = Console.readLine();
        Validator.validateIsBlank(input);
        Map<Menu, Integer> menuIntegerMap = new EnumMap<>(Menu.class);
        String[] menus = input.split(",");
        for (String val : menus) {
            String[] menu = val.split("-");
            Validator.validateIsDigit(menu[1]);
            menuIntegerMap.put(Menu.convertMenu(menu[0]), Integer.parseInt(menu[1]));
        }
        return menuIntegerMap;
    }
}
