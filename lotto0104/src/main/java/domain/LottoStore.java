package domain;

import java.util.ArrayList;
import java.util.List;

public class LottoStore {

    private final int count;


    public LottoStore(int count) {
        this.count = count/1000;
    }

    public Lottos generateLottos(NumberGenerator numberGenerator){
        List<Lotto> lottos = new ArrayList<>();
        for(int i =0; i<count;i++){
            Lotto lotto = new Lotto(numberGenerator.generate());
            lottos.add(lotto);
        }
        return new Lottos(lottos);
    }

}
