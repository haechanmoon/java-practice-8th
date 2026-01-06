package domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    private final List<String> names;

    public CarFactory(List<String> names) {
        this.names = names;
    }

    public Cars generateCars(){
        List<Car> cars = new ArrayList<>();
        for(String name : names){
            cars.add(new Car(name));
        }
        return new Cars(cars);
    }
}
