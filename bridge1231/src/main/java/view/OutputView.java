package view;

import java.util.List;
import utils.Messages;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    public static void printStartGame() {
        System.out.println(Messages.PRINT_START_GAME);
    }

    public static void requestBridgeSize() {
        System.out.println(Messages.REQUEST_BRIDGE_SIZE);
    }

    public static void requestUOrD() {
        System.out.println(Messages.REQUEST_UP_OR_DOWN);
    }

    public static void requestRetry() {
        System.out.println(Messages.REQUEST_RETRY);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printResult(List<String> up, List<String> down, boolean b, int tryCount) {
        System.out.println("\n도전 결과");
        System.out.println("[ " + String.join(" | ", up) + " ]");
        System.out.println("[ " + String.join(" | ", down) + " ]");

        String a;
        if (b) {
            a = "성공";
        } else {
            a = "실패";
        }

        System.out.println("\n게임 성공 여부 : " + a);
        System.out.printf("총 시도한 횟수 %d", tryCount);
    }
}

/**
 * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
 * <p>
 * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
 */
//    public void printMap() {
//    }


