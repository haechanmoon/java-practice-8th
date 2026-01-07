package utils;

public class Messages {
    public static final String PRINT_START_HEADER = "\n*** 탐험 시작 ***";
    public static final String PRINT_ROUND_HEADER = "%n[%d구역]%n";
    public static final String PRINT_RESULT_HEADER = "\n[최종 결과]";
    public static final String REQUEST_NAMES = "탐험할 헌터의 이름을 입력하세요.";
    public static final String REQUEST_SIZE = "\n던전의 길이를 입력하세요.";

    private static final String ERROR_PREFIX = "[ERROR] ";

    public static final String ERROR_NAME_LENGTH =ERROR_PREFIX+ "이름은 5자 이하여야 합니다.";
    public static final String ERROR_NOT_STATE = ERROR_PREFIX+"랜덤값 입력이 옳지 않습니다.";
    public static final String ERROR_NAME_BLANK = ERROR_PREFIX+"이름 중 빈값이 있습니다.";
    public static final String ERROR_INPUT_BLANK = ERROR_PREFIX+"값을 입력해주세요.";
    public static final String ERROR_IS_NOT_DIGIT = ERROR_PREFIX+"1이상의 숫자를 입력해주시기 바랍니다.";

}
