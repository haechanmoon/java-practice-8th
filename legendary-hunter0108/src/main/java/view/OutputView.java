package view;

import domain.Monster;
import java.util.Map;

public class OutputView {
    public static void printStistics(Map<Monster, Integer> result) {
        System.out.println("\n[사냥 결과]");
        for(Monster monster : Monster.values()){
            System.out.printf("- %s (%dG) - %d마리%n"
                    , monster.getName(), monster.getPrize(),result.getOrDefault(monster,0));
        }
    }

    public static void printRatio(double ratio) {
        System.out.printf("\n총 수익률은 %.1f%%입니다.",ratio);
    }
}
