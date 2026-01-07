package domain;

import utils.Validator;

public class Hunter {

    private final String name;
    private int stamina;
    private int gold;

    public Hunter(String name) {
        Validator.validateNameLength(name);
        this.name = name;
    }
}
