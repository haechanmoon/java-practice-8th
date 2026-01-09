package controller;

import domain.Calculator;
import view.InputView;
import view.OutputView;

public class CalculatorGame {
    public void start() {
        //1. 문자열을 입력받는다.
        String input = readInput();

        //2. 값을 춮력한다.
        printResult(input);
    }

    private void printResult(String input) {
        Calculator calculator = new Calculator(input);
        int sum = calculator.sumNumbers(calculator.splitNumbers());
        OutputView.printResult(sum);
    }

    private String readInput() {
        OutputView.requestInput();
        return InputView.readInput();
    }




}
