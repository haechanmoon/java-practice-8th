package service;

import domain.Car;
import domain.Cars;
import domain.RandomGenerator;
import java.util.ArrayList;
import java.util.List;

public class RacingCarService {

    private final Cars cars;

    public RacingCarService(List<String> carNames) {
        this.cars = generateCars(carNames);
    }

    public Cars generateCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name));
        }
        return new Cars(cars);
    }

    public String goCar() {
        return cars.goCars(RandomGenerator.generateNumber());
    } //하 이런대서 진짜 ㅈㄴ막히네. 이거 어떡하냐

    public List<Car> getCars() {
        return cars.getCars();
    }
}
