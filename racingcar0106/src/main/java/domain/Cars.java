package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void carsGo(NumberGenerator numberGenerator){
        /*
        //근데 이걸 과연필드에 두는게 맞을까?
        왜냐하면 지금 이게 보면 갈때마다 생성해야하기 때문에 좀 귀찮을것같긴한데. 아 박아두면되겠다!
         */
        for(Car car : cars){
            car.go(numberGenerator.generate());
        }
    }

    public List<String> currentCarsPosition(){
        List<String> carsPosition = new ArrayList<>();
        for(Car car:cars) {
            carsPosition.add(car.currentPosition());
        }
        return carsPosition;
    }

}
