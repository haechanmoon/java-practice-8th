package controller;

import domain.Cars;
import domain.Numbers;
import domain.RandomNumbers;
import java.util.List;
import utils.Parser;
import view.InputView;
import view.OutputView;

public class RacingCarGame {
    public void start() {

        OutputView.requestNames();
        List<String> names = Parser.parseNames(InputView.readInput());

        OutputView.requestTurns();
        int turn = Parser.parseTurns(InputView.readInput());


        Cars cars = new Cars(names);
        Numbers numbers = new RandomNumbers();
        OutputView.printResultHeader();
        for(int i = 0 ; i<turn;i++){
            cars.goCars(numbers);
            OutputView.printCarsPosition(cars.carsPosition());
        }
        OutputView.printWinners(cars.getWinner());
    }
}
