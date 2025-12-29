package domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private final List<Car> cars;

    public Winners(List<Car> cars) {
        this.cars = cars;
    }

    public String findWinner() {
        int maxNum = 0;
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            winners.add(car.validateWinner(maxNum));
        }
        return String.join(", ", winners);
    }
}
