package controller;

import domain.Calculator;
import domain.EventDay;
import domain.Menu;
import domain.Order;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;
import view.InputView;
import view.OutputView;

public class ChristmasGame {

    public void start() {
        OutputView.printStartMessages();

        int date = retry(() -> {
            OutputView.requestDate();
            return InputView.inputDate();
        });

        Map<Menu, Integer> menuList = retry(() -> {
            OutputView.requestMenu();
            return InputView.inputMenu();
        });

        OutputView.printEventPreview();
        OutputView.printMenus();
        OutputView.printOrderdMenus(menuList);

        OutputView.printBeforeSale();
        int beforeCount = 0;
        for (Entry<Menu, Integer> entry : menuList.entrySet()) {
            beforeCount += entry.getKey().getCost() * entry.getValue();
        }
        OutputView.printBeforeCost(beforeCount);

        OutputView.printBonusMenu(beforeCount);
        if (beforeCount >= 120000) {
            OutputView.printSham();
        }

        int dDayDiscount = EventDay.dayDiscount(date);
        boolean isWeekend = EventDay.isWeekend(date);
        boolean isStar = EventDay.isStarDate(date);
        int afterDiscount = beforeCount;
        Order order = new Order(menuList);

        Calculator calculator = new Calculator(beforeCount, menuList);
        if (isWeekend) {
            afterDiscount -= calculator.discountMain(order);
        } else {
            afterDiscount -= calculator.discountDessert(order);
        }
        if (isStar) {
            afterDiscount -= 1000;
        }
        afterDiscount -= dDayDiscount;

        OutputView.printTotalBenefit(afterDiscount, beforeCount);


    }

    private <T> T retry(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                OutputView.printError(e.getMessage());
            }
        }
    }
}
