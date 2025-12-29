package domain;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position = 0;
    }

    public void go(int random) {
        if (random >= 4) {
            position++;
        }
    }

    public String printPosition() {
        return name + " : "
                + "-".repeat(Math.max(0, position));
    }

    public String validateWinner(int winNum) {
        if (position < winNum) {
            return "";   // 이거 한번 검사 받아보자.
        }
        return name;
    }


}
