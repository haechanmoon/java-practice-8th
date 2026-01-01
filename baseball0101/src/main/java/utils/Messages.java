package utils;

public class Messages {


    public static final String PRINT_GAME_START = "숫자 야구 게임을 시작합니다.";
    public static final String REQUEST_NUMBER = "숫자를 입력해주세요 : ";
    public static final String PRINT_THREE_STRIKE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public static final String REQUEST_RETRY = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String ERROR_PREFIX = "[ERROR] ";

    public static final String ERROR_IS_NOT_DIGIT = ERROR_PREFIX+"숫자를 입력해주시기 바랍니다.";
    public static final String ERROR_IS_NOT_SIZE = ERROR_PREFIX + "숫자의 자릿수를 확인 바랍니다.";
    public static final String ERROR_NUMBER_DUPLICATED = ERROR_PREFIX + "숫자가 중복되었습니다.";
    public static final String ERROR_IS_NOT_COMMAND = ERROR_PREFIX+"1과2중 하나를 입력바랍니다.";

}
