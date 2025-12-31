package bridge;

import domain.BridgeMaker;
import domain.BridgeRandomNumberGenerator;
import java.util.ArrayList;
import java.util.List;
import view.InputView;
import view.OutputView;

public class Application {

    public static void main(String[] args) {
        OutputView.printStartGame();
        OutputView.requestBridgeSize();
        int size = InputView.inputSize();
        BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
        List<String> bridge = bridgeMaker.makeBridge(size);

        int tryCount = 1;
        while (true) {
            List<String> up = new ArrayList<>();
            List<String> down = new ArrayList<>();
            boolean failed = false;

            for (int i = 0; i < size; i++) {
                OutputView.requestUOrD();
                String input = InputView.inputLetter();

                String answer = bridge.get(i);
                if (input.equals("U")) {
                    up.add(input.equals(answer) ? "O" : "X");
                    down.add(" ");
                } else {
                    up.add(" ");
                    down.add(input.equals(answer) ? "O" : "X");
                }

                spliter(up, down);

                if (!input.equals(answer)) {
                    failed = true;
                    break;
                }
            }

            if (failed) {
                OutputView.requestRetry();
                String command = InputView.inputLetter();
                if (command.equals("Q")) {
                    OutputView.printResult(up, down, false, tryCount);
                    break;
                }
                tryCount++;
            } else {
                OutputView.printResult(up, down, true, tryCount);
                break;
            }


        }
    }

    public static void spliter(List<String> up, List<String> down) {
        String ups = String.join(" | ", up);
        String downs = String.join(" | ", down);

        System.out.println("[ " + ups + " ]");
        System.out.println("[ " + downs + " ]");
    }

}

