package controller;

import service.RacingCarService;
import view.InputView;
import view.OutputView;

public class RacingCarGame {

    public void start() {
        OutputView.requestNames();
        String names = InputView.getNames();
        OutputView.requestTurns();
        String turns = InputView.getTurns();
        RacingCarService service = new RacingCarService(names, turns);
        OutputView.printLetterResult();
        OutputView.printRunResult(service.run());
    }
}
