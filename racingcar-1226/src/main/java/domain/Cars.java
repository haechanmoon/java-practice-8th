package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    private List<String> getWinners() {
        int count = 0;
        List<String> names = new ArrayList<>();
        count = getMaxPosition(count);
        getWinner(count, names);
        return names;
    }

    private void getWinner(int count, List<String> names) {
        for (Car car : cars) {
            if (count == car.getPosition()) {
                names.add(car.getName());
            }
        }
    }

    private int getMaxPosition(int count) {
        for (Car car : cars) {
            if (count <= car.getPosition()) {
                count = car.getPosition();
            }
        }
        return count;
    }

    public String writeWinners() {
        return String.join(", ", getWinners());
    }

}
