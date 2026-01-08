package lotto;

import controller.LottoGame;
import domain.NumberGenerator;
import domain.RandomNumberGenerator;

public class Application {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        LottoGame game = new LottoGame(numberGenerator);
        game.start();
    }
}
