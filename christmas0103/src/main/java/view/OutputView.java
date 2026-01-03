package view;

import domain.Menu;
import java.util.Map;
import java.util.Map.Entry;
import utils.Messages;

public class OutputView {
    public static void printStartMessages() {
        System.out.println(Messages.PRINT_START_MESSAGES);
    }

    public static void requestDate() {
        System.out.println(Messages.REQUEST_DATE);
    }

    public static void printError(String message) {
        System.out.println(message);
    }

    public static void requestMenu() {
        System.out.println(Messages.REQUEST_MENU);
    }

    public static void printEventPreview() {
        System.out.println(Messages.PRINT_EVENT_PREVIEW);
    }

    public static void printMenus() {
        System.out.println(Messages.PRINT_ORDERD_MENU);
    }

    public static void printOrderdMenus(Map<Menu, Integer> menuList) {
        for (Entry<Menu, Integer> menuIntegerEntry : menuList.entrySet()) {
            System.out.printf("%s %d개%n", menuIntegerEntry.getKey().name, menuIntegerEntry.getValue());
        }
    }

    public static void printBeforeSale() {
        System.out.println(Messages.PRINT_BEFORE_SALE);
    }

    public static void printBeforeCost(int beforeCount) {
        System.out.printf("%,d원", beforeCount);
    }

    public static void printBonusMenu(int beforeCount) {
        System.out.println(Messages.PRINT_BONUS_MENU);
        if (beforeCount > 120000) {
            System.out.println(Messages.PRINT_SHAM);
        } else {
            System.out.println(Messages.NO_BONUS);
        }
    }

    public static void printSham() {
        System.out.println(Messages.PRINT_SHAM);
    }

    public static void printTotalBenefit(int afterDiscount, int beforeCount) {
        System.out.printf(Messages.PRINT_TOTAL_BENEFIT + "%n%,d원", (beforeCount - afterDiscount));
    }
    
}