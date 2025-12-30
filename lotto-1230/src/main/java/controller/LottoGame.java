package controller;

import View.InputView;
import View.OutputView;
import domain.Lottos;
import domain.Parser;

public class LottoGame {

    public void start() {
        //액수만큼 로또를 생성한다.
        Lottos lottos = generateLottos();

        //당첨번호와 보너스 번호를 기반으로 당첨 통계를 낸다.
        //수익률을 구한다.

    }

    private Lottos generateLottos() {
        OutputView.requestMoney();
        int money = Parser.parseMoney(InputView.getInput());

    }
}
