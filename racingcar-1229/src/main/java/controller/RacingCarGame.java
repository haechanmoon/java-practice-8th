package controller;

import domain.Car;
import domain.Parser;
import domain.Winners;
import java.util.List;
import service.RacingCarService;
import view.InputView;
import view.OutputView;

public class RacingCarGame {

    public void start() {
        RacingCarService service = generateCars();
        List<Car> cars = goCars(service);
        Winners winners = new Winners(cars);
        OutputView.printWinners(winners.findWinner());
    }

    public RacingCarService generateCars() {
        OutputView.requestName();
        String nameInput = InputView.readInput();
        List<String> names = Parser.parseNames(nameInput);
        return new RacingCarService(names);
    }

    public List<Car> goCars(RacingCarService service) {
        OutputView.requestTurn();
        String turnInput = InputView.readInput();
        int turn = Parser.parserTurn(turnInput);
        StringBuilder board = new StringBuilder();
        for (int i = 0; i < turn; i++) {
            board.append(service.goCar());
        }
        OutputView.printResult(board);
        return service.getCars();
    }

}
