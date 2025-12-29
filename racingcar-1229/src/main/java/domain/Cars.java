package domain;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public String carsPosition() {
        StringBuilder currentBoard = new StringBuilder();
        for (Car car : cars) {
            currentBoard.append(car.printPosition()).append("\n");
        }
        return currentBoard.toString();
    }
}
