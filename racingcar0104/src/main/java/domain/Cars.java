package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<String> names) {
        this.cars = new ArrayList<>();
        for (String name : names) {
            this.cars.add(new Car(name));
        }
    }

public void goCars(Numbers numbers) {
    for (Car car : cars) {
        car.go(numbers);
    }
}

public String carsPosition() {
    StringBuilder sb = new StringBuilder();
    for (Car car : cars) {
        sb.append(car.currentPosition()).append("\n");
    }
    return sb.toString();
}

public String getWinner() {
    int position = 0;
    for (Car car : cars) {
        if (car.getPosition() > position) {
            position = car.getPosition();
        }
    }
    List<String> winners = new ArrayList<>();
    for (Car car : cars) {
        if (car.getPosition() == position) {
            winners.add(car.getName());
        }
    }
    return String.join(", ", winners);
}

}
