package domain;

public class Car {

    private static final int STANDARD_NUMBER = 4;
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position = 0;
    }

    public void go(int num) {
        if (num >= STANDARD_NUMBER) {
            position++;
        }
    }

    public String currentPosition() {
        return name + " : "
                + "-".repeat(Math.max(0, position));
    }

    public int getPosition() {
        return position;
    }


    public String getName() {
        return name;
    }
}
