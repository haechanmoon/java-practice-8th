package domain;

import java.util.Map;

public class Calculator {

    private final int beforeDiscount;
    private final Map<Menu, Integer> ordered;

    public Calculator(int beforeDiscount, Map<Menu, Integer> ordered) {
        this.beforeDiscount = beforeDiscount;
        this.ordered = ordered;
    }

    public int discountDessert(Order order) {
        int dessertCount = order.menuCount(MenuType.DESSERT);
        return dessertCount * 2023;
    }

    public int discountMain(Order order) {
        int mainCount = order.menuCount(MenuType.MAIN);
        return mainCount * 2023;
    }
}