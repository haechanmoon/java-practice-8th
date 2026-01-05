package domain;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class LottoStore {

    private final NumberGenerator numberGenerator;


    public LottoStore(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Lottos generateLotto(int money){
        Validator.validateMoneyUnit(money);
        List<Lotto> lottos = new ArrayList<>();
        for(int i = 0 ; i<money/1000;i++){
            Lotto lotto = new Lotto(numberGenerator.generator());
            lottos.add(lotto);
        }
        return new Lottos(lottos);
    }

}
