package controller;

import domain.HunterFactory;
import domain.Hunters;
import domain.NumberGenerator;
import domain.RandomNumberGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import utils.Parser;
import view.InputView;
import view.OutputView;

public class HunterGame {
    public void start() {
        //헌터들을 만든다.
        Hunters hunters = assembleHunters();

        //던전의 길이를 입력받는다.
        int size = readSize();
        //게임을 진행한다.
        processFight(hunters, size);
        //최종결과를 출력한다.
        printResult(hunters);
    }

    private void printResult(Hunters hunters) {
        OutputView.printResultHeader();
        List<String> liveHunters = hunters.hunterIndividualGold();
        OutputView.printLiveHunters(liveHunters);
        int totalGold = hunters.huntersTotalGold();
        OutputView.printTotalGold(totalGold);
        List<String> deadHunters = hunters.deadHunters();
        OutputView.printDeadHunters(deadHunters);
    }

    private void processFight(Hunters hunters, int size) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        OutputView.printStartHeader();
        for(int i =0 ; i<size;i++){
            OutputView.printRoundHeader(i+1);
            List<String> currentStatus = hunters.huntersGo(numberGenerator.generate());
            OutputView.printHuntersStatus(currentStatus);
        }
    }

    private int readSize() {
        OutputView.requestSize();
        return retry(()->Parser.parseSize(InputView.readInput()));
    }

    private Hunters assembleHunters() {
        OutputView.requestNames();
        List<String> names = retry(()-> Parser.parseNames(InputView.readInput()));
        return retry(()->{
            HunterFactory hunterFactory = new HunterFactory(names);
            return hunterFactory.generateHunters();
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
