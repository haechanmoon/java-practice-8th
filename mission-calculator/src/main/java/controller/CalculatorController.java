package controller;

import domain.Calculator;
import domain.Parser;
import view.InputView;
import view.OutputView;

public class CalculatorController {

    public void run() {
        OutputView.requestInput();
        String input = InputView.getInput();
        Parser parser = new Parser(input);
        Calculator calculator = new Calculator(parser.parseInput());
        OutputView.printResult(calculator.sum());
    }
}
