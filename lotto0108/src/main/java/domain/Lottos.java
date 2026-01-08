package domain;

import java.util.ArrayList;
import java.util.List;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public List<String> lottoNumbers(){
        List<String> numbers = new ArrayList<>();
        for(Lotto lotto : lottos){
            numbers.add(lotto.toString());
        }
        return numbers;
    }
}
