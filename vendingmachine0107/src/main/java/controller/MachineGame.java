package controller;

import domain.BoxStore;
import domain.Boxes;
import domain.Rank;
import domain.Statistics;
import java.util.Map;
import java.util.function.Supplier;
import utils.Parser;
import view.InputView;
import view.OutputView;

public class MachineGame {

    public void start(){

        int money = purchaseBoxes();
        Boxes boxes = generateBoxes(money);
        Map<Rank, Integer> result = printStatistics(boxes);
        printWinRate(result,money);

    }

    private void printWinRate(Map<Rank, Integer> result, int money) {
        Statistics statistics = new Statistics(result);
        double ratio = statistics.calculateRate(money);
        OutputView.printWinRate(ratio);
    }

    private Map<Rank, Integer> printStatistics(Boxes boxes) {
        Map<Rank, Integer> result = boxes.calculateRanks();
        OutputView.printStatistics(result);
        return result;
    }

    private Boxes generateBoxes(int money) {
        return retry(()->{
            BoxStore store = new BoxStore(money);
            return store.generateBox();
        });
    }

    private int purchaseBoxes() {
        OutputView.requestMoney();
        return retry(()-> Parser.parseMoney(InputView.readInput()));
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
