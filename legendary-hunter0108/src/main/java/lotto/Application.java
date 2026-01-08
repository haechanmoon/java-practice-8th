package lotto;

import controller.DungeonGame;
import domain.NumberGenerator;
import domain.RandomNumberGenerator;

public class Application {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        DungeonGame game = new DungeonGame(numberGenerator);
        game.start();
    }
}
