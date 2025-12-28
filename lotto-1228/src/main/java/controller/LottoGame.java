package controller;

import domain.Rank;
import java.util.Map;
import service.LottoService;
import view.InputView;
import view.OutputView;

public class LottoGame {

    public void start() {
        LottoService service = loadLottoService();
        OutputView.printLottoCount(service.lottoCount());
        OutputView.printLottos(service.printLottos());

        Map<Rank, Integer> result = loadResult(service);
        OutputView.printStatistics(result);
        OutputView.printRation(service.resultRatio(result));
    }

    private LottoService loadLottoService() {
        while (true) {
            try {
                OutputView.requestMoney();
                String money = InputView.inputRead();
                return new LottoService(money);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Map<Rank, Integer> loadResult(LottoService service) {
        while (true) {
            try {
                OutputView.requestWinNumbers();
                String numbers = InputView.inputRead();
                OutputView.requestBonusNumber();
                String bonus = InputView.inputRead();
                return service.getMap(numbers, bonus);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}