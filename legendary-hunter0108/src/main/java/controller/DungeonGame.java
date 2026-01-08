package controller;

import domain.Calculator;
import domain.HunterGenerator;
import domain.Hunters;
import domain.Monster;
import domain.NumberGenerator;
import java.util.Map;
import utils.Parser;
import view.InputView;
import view.OutputView;

public class DungeonGame {
    private final NumberGenerator numberGenerator;

    public DungeonGame(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }


    public void start() {
        //1.돈을 받는다.
        System.out.println("사냥에 사용할 금액을 입력해 주세요.");
        int money = Parser.parseMoney(InputView.readInput());
        //2. 돈만큼 헌터들을 생성한다.
        Hunters hunters = generateHunters(numberGenerator,money);
        //3. 통계를 구한다.
        Map<Monster, Integer> result = processGame(hunters);
        //4. 통계를 출력한다.
        printStatistics(result);
        //5. 수익률 출력한다.
        printRatio(result,money);

    }

    private void printRatio(Map<Monster, Integer> result, int money) {
        Calculator calculator = new Calculator(result);
        double ratio = calculator.calculateRate(money);
        OutputView.printRatio(ratio);
    }

    private void printStatistics(Map<Monster, Integer> result) {
        OutputView.printStistics(result);
    }

    private Map<Monster, Integer> processGame(Hunters hunters) {
        return hunters.calculateResult();
    }

    private Hunters generateHunters(NumberGenerator numberGenerator, int money) {
        HunterGenerator hunterGenerator = new HunterGenerator(money);
        System.out.printf("%d마리의 몬스터를 사냥했습니다.",money/1000);
        return hunterGenerator.generateHunter(numberGenerator);
    }

}
