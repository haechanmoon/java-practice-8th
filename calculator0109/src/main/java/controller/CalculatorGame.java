package controller;

import view.OutputView;

public class CalculatorGame {
    public void start() {
        //1. 문자열을 입력받는다.
        String input = readInput();

        //2. 값을 춮력한다.
    }

    private String readInput() {
        OutputView.requestInput();
    }
}
