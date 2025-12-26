package domain;

public class Car {

    private static int RANDOM_NUMBER;
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position = 0;
    }

    public void go(int num) {
        if (num >= RANDOM_NUMBER) {
            position++;
        }
    }

    public String currentPosition() {
        return name + " : "
                + "-".repeat(Math.max(0, position));
    }


}
