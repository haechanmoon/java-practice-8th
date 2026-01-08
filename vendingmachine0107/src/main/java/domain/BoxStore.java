package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class BoxStore {

    private static final int BOX_PRICE = 1000;
    public final int money;

    public BoxStore(int money) {
        Validator.validateUnit(money);
        this.money = money;
    }

    public Boxes generateBox(){
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        List<Box> boxes = new ArrayList<>();
        for(int i =0 ; i<money/BOX_PRICE;i++){
            boxes.add(new Box(numberGenerator.generate()));
        }
        return new Boxes(boxes);
    }
}
