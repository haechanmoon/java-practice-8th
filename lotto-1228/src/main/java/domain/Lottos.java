package domain;

import java.util.List;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public String toString() {
        StringBuilder lottoBoard = new StringBuilder();
        for (Lotto lotto : lottos) {
            lottoBoard.append(lotto.toString()).append("\n");
        }
        return lottoBoard.toString();
    }


}
