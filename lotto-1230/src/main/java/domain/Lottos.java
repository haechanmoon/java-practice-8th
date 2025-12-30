package domain;

import java.util.List;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public String lottosToString() {
        StringBuilder lottoBoard = new StringBuilder();
        for (Lotto lotto : lottos) {
            lottoBoard.append(lotto.toString()).append("\n");
        }
        return lottoBoard.toString();
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public int lottosSize() {
        return lottos.size();
    }
}
