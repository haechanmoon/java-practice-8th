package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class LottoStore {

    private static final int LOTTO_PRICE = 1000;
    private final int money;

    public LottoStore(int money) {
        Validator.validateIsLottoUnit(money);
        this.money = money;
    }

    public Lottos generateLottos(NumberGenerator numberGenerator){
        List<Lotto> lottos = new ArrayList<>();
        for(int i=0;i<money/LOTTO_PRICE ;i++){
            lottos.add(new Lotto(numberGenerator.generate()));
        }
        return new Lottos(lottos);
    }
}
