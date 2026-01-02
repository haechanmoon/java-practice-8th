package domain;

import java.util.List;
import utils.Validator;

public class People {

    private final List<String> names;

    public People(List<String> names) {
        Validator.validateNameLength(names);
        Validator.validateNameCount(names);
        this.names = names;
    }


}
