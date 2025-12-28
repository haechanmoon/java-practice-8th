package controller;

import service.LottoService;
import view.InputView;
import view.OutputView;

public class LottoGame {

    public void start() {
        OutputView.requestMoney();
        String money = InputView.inputRead();
        LottoService service = new LottoService(money);
        OutputView.printLottoCount(service.lottoCount());
        OutputView.printLottos(service.printLottos());
        OutputView.requestWinNumbers();
        String numbers = InputView.inputRead();
        OutputView.requestBonusNumber();
        String bonus = InputView.inputRead();
        OutputView.printStatistics(service.getMap(numbers, bonus));
        OutputView.printRation(service.resultRatio(service.getMap(numbers, bonus)));
    }
}