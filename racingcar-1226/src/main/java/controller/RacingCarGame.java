package controller;

import view.InputView;
import view.OutputView;

public class RacingCarGame {

    public void start() {
        OutputView.requestNames();
        String names = InputView.getNames();
        OutputView.requestTurns();
    }
}
