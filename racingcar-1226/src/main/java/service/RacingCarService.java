package service;

import domain.Car;
import domain.Cars;
import domain.Parser;
import domain.RandomGenerator;
import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class RacingCarService {

    private final String names;
    private final int turns;

    public RacingCarService(String names, String turns) {
        this.names = names;
        Validator.validateIsDigit(turns);
        this.turns = Integer.parseInt(turns);
    }

    public Cars generateCars() {
        Parser parser = new Parser(names);
        List<Car> cars = new ArrayList<>();
        for (String name : parser.splitInput()) {
            Car car = new Car(name);
            cars.add(car);
        }
        return new Cars(cars);
    }

    public String run(Cars cars) {
        RandomGenerator random = new RandomGenerator();
        cars.runTurns(turns, random);
    }

}
