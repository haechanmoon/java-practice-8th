package domain;

import java.util.Map;

public class Order {

    private final Map<Menu, Integer> items;

    public Order(Map<Menu, Integer> items) {
        this.items = items;
    }

    public int menuCount(MenuType menuType) {
        int count = 0;
        for (Menu menu : Menu.values()) {
            if (menu.getMenuType() == menuType) {
                count++;
            }
        }
        return count;
    }
}
