package utils;

public class Messages {
    public static final String REQUEST_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String REQUEST_TURNS = "시도할 횟수는 몇 회인가요?";

    private static final String ERROR_PREFIX = "[ERROR] ";
    public static final String ERROR_NAME_LENGTH = ERROR_PREFIX+"이름이 5자 이하여야합니다.";
    public static final String ERROR_IS_BLANK = ERROR_PREFIX+"값을 입력해주세요.";
    public static final String ERROR_NAME_BLANK = ERROR_PREFIX+"이름 중 빈값이 있습니다.";
    public static final String ERROR_NAME_DUPLICATED = ERROR_PREFIX+"이름이 중복되었습니다.";
    public static final String ERROR_IS_NOT_DIGIT = ERROR_PREFIX+"1이상의 숫자를 입력해주세요.";
}
