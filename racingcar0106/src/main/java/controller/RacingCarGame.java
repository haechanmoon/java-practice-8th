package controller;

import domain.CarFactory;
import domain.Cars;
import domain.NumberGenerator;
import domain.RandomNumberGenerator;
import java.util.List;
import java.util.function.Supplier;
import utils.Parser;
import view.InputView;
import view.OutputView;

public class RacingCarGame {

    public void start(){
        //1. 자동차들을 만든다.
        Cars cars = generateCars();

        //1.5 몇회인지 입력받는다.
        int turn = readTurns();

        //2. N번 굴려 우승자를 구한다.
        List<String> winners = startRace(cars,turn);

        //3. 최종 우승자들을 출력한다.
        printWinners(winners);

    }

    private void printWinners(List<String> winners) {
        OutputView.printWinners(winners);
    }

    private List<String> startRace(Cars cars, int turn) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        for(int i =0 ; i <turn;i++){
            cars.carsGo(numberGenerator);
            OutputView.printCurrentCars(cars.currentCarsPosition());
        }
        return cars.raceWinners();
    }

//    private void printWinners(Cars cars, int turn) {
//        String winners = String.join(", ",cars.raceWinners());
//        System.out.println(winners);
//    }

//    private List<String> startRace(Cars cars, int turn) {
//        //자. 게임돌려서 우승자들을 마지막에 번 털어내는거잖아. 그럼 계속 바뀔거아니야. 그거를 어떻게 저장할거?
//        NumberGenerator numberGenerator = new RandomNumberGenerator();
//        List<String> winners = new ArrayList<>();
//        for(int i = 0 ; i<turn;i++) {
//            cars.carsGo(numberGenerator);
//            OutputView.printCurrentCars(cars.currentCarsPosition());
//            if(i==turn-1){
//                winners = cars.startRace();
//            }
//        }
//    }

    private int readTurns() {
        OutputView.requestTurns();
        return retry(()->Parser.parseTurns(InputView.readInput()));
    }

    private Cars generateCars() {
        OutputView.requestCarNames();
        return  retry(()-> {
            List<String> names = Parser.parseNames(InputView.readInput());
            CarFactory carFactory = new CarFactory(names);
            return carFactory.generateCars();
        });
    }

    private <T> T retry(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                OutputView.printError(e.getMessage());
            }
        }
    }
}
