package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    private void goCars() {
        RandomGenerator generator = new RandomGenerator();
        for (Car car : cars) {
            car.go(generator.generateRandom());
        }
    }

    public Map<Car, Integer> runTurns(int turns) {
        Map<Car, Integer> position = new HashMap<>();
        for (int i = 0; i < turns; i++) {
            goCars();
            for (Car car : cars) {
                position.put(car, car.getPosition());
            }
        }
        return position;
    }

    public String printResult() {
        StringBuilder resultBoard = new StringBuilder();
        for (Car car : cars) {
            resultBoard.append(car.currentPosition()).append("\n");
        }
        return resultBoard.toString();
    }

}
