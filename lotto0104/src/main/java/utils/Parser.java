package utils;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

public class Parser {
    public static int parseMoney(String input) {
        Validator.validateIsDigit(input);
        int money = Integer.parseInt(input);
        Validator.validateIsUnit(money);
        return money;
    }

    public static List<Integer> parseWinNums(String input) {
        List<Integer> list = new ArrayList<>();
        String[] split = input.split(",");
        for(String num : split){
            Validator.validateIsDigit(num);
            int winNum = Integer.parseInt(num);
            list.add(winNum);
        }
        Validator.validateRange(list);
        Validator.validateDuplicated(list);
        Validator.validateSize(list);
        return list;
    }

    public static int parseBonusNum(String input, List<Integer> winNums) {
        Validator.validateIsDigit(input);
        int bonus = Integer.parseInt(input);
        Validator.validateBonusDuplicated(winNums,bonus);
        return bonus;
    }
}
