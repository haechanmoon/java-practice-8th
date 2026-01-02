package controller;

import java.util.List;

public class Names {

    public final List<String> workingDay;
    public final List<String> restDay;

    public Names(List<String> workingDay, List<String> restDay) {
        this.workingDay = workingDay;
        this.restDay = restDay;
    }
}
