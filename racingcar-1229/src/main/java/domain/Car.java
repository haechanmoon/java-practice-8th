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
}
