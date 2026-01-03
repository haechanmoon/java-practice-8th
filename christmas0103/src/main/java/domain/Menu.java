package domain;

import utils.Messages;

public enum Menu {

    SOUP("양송이수프", 6000, MenuType.EPI),
    TAPAS("타파스", 5500, MenuType.EPI),
    SALAD("시저샐러드", 8000, MenuType.EPI),
    STAKE("티본스테이크", 55000, MenuType.MAIN),
    LIP("바베큐립", 54000, MenuType.MAIN),
    SEAPASTA("해산물파스타", 35000, MenuType.MAIN),
    CHRPASTA("크리스마스파스타", 25000, MenuType.MAIN),
    CHOCOCAKE("초코케이크", 15000, MenuType.DESSERT),
    ICECREAM("아이스크림", 5000, MenuType.DESSERT),
    ZEROCOKE("제로콜라", 3000, MenuType.DRINK),
    REDWINE("레드와인", 60000, MenuType.DRINK),
    CHAMPAIN("샴페인", 25000, MenuType.DRINK);

    private final String name;
    private final int cost;
    private final MenuType menuType;

    Menu(String name, int cost, MenuType menuType) {
        this.name = name;
        this.cost = cost;
        this.menuType = menuType;
    }

    public static Menu convertMenu(String input) {
        for (Menu menu : Menu.values()) {
            if (menu.name.equals(input)) {
                return menu;
            }
        }
        throw new IllegalArgumentException(Messages.ERROR_NO_MENU);
    }


    public MenuType getMenuType() {
        return menuType;
    }

    public int getCost() {
        return cost;
    }
}

