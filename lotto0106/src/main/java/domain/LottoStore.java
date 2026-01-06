package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utils.Validator;

public class LottoStore {

    private static final int LOTTO_PRICE = 1000;
    private final NumberGenerator numberGenerator;


    public LottoStore(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Lottos generateLotto(int money){
        int lottoCount = money/LOTTO_PRICE;
        List<Lotto> lottos = new ArrayList<>();
        for(int i = 0 ; i<lottoCount;i++){
            Lotto lotto = new Lotto(numberGenerator.generator());
            lottos.add(lotto);
        }
        return new Lottos(lottos);
    }

}
