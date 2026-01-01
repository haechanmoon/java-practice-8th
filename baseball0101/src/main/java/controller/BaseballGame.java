package controller;

import domain.Computer;
import domain.NumberGenerator;
import domain.Parser;
import domain.RandomGenerator;
import domain.Result;
import java.util.List;
import java.util.function.Supplier;
import view.InputView;
import view.OutputView;

public class BaseballGame {

    public void start() {
        OutputView.printStartGame();

        NumberGenerator random = new RandomGenerator();
        Computer computer = new Computer(random.generate());

        while (true) {
            Result result = getResult(computer);
            OutputView.printResult(result);
            if (result.check()) {
                String command = getCommand();
                if (command.equals("2")) {
                    break;
                } else {
                    random = new RandomGenerator();
                    computer = new Computer(random.generate());
                }
            }
        }
    }

    private Result getResult(Computer computer) {
        List<Integer> numbers = retry(() -> {
            OutputView.requestNumber();
            String input = InputView.inputString();
            return Parser.convertString(input);
        });
        return computer.checkNumbers(numbers);
    }

    private String getCommand() {
        OutputView.printStrike();
        OutputView.requestRetry();
        String command = retry(() -> {
            String input = InputView.inputString();
            return Parser.commandParse(input);
        });
        return command;
    }

    private <T> T retry(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                OutputView.printError(e.getMessage());
            }
        }
    }
}

/*
일단 여기 while문, if문, else문 있는거 개극혐임. 이거를 진짜 뜯어 고칠 줄 알아야해. 이거를 하냐마냐가 진짜 달라진다.
어제 못했던 다리만들기 한번 오늘 도전해보자. 이정도면 할 수 있을 것 같다.아 잠만 도파민 너무 터져나오는데. 이거
잠깐만쉴까. 하 . 숫자야구쯤은 이제 좀 할 수 있을 것 같다.이거 내가 진짜 괜히 시간을 쓴 게 아니라니까
이정도는 할 수 있다니까.
근데 Enum을 잘 쓸 줄 알아야해. Enum이 없잖아. 여기서는. EnumMap이 뭔지 알아? 왜Rank를 쓰는지 알아? 왜 Map을 쓰는지 알아?
대충하지말고. 왜 저런 코드가 나왔는지를 좀 알자고. Lotto공부를 좀 더 하자고. 그걸 알아야 나머지 거를 구현 할 수 있을 것 같아.
5시간 진짜 많은것같지만. 거기서 고민하고 생각하고 있으면 아무것도 할 수가 없음.
자. 일단. 한대 빨고 와서 시작해보자. 다시 시작해보자. 나는 할 수 있다. 몰입한 상태에 있었다. ㅎ 12시 반부터 시작해서 5시쯤 끝냈잖아.?
게다가 1시간정도는 피자먹고옴. 잠. ㅋㅋ 어쨌든. 화이팅이야. 나는 할 수 있다는 것을 증명했어. 나는. 할 수 있다.
근데 심지어 검색이랑 그런것도 다 된다고 하니 뭐 어려울 거 없는것같은데. 미리 정리해가면 솔직히 구현못할게 없지않나?
아무리 for랑 while을 많이 쓴다고해도 말이야. 내가 구현을 아예 못하는것도 아니고. 지금 17시35분인데. 뭐 어떡하지. oncall한번 짜보는게 좋을것같은데.
oncall가자!
아 맞다 oncall은 그럼 내일 짜고
 */