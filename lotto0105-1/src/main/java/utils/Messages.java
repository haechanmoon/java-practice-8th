package utils;

public class Messages {



    private static final String ERROR_PREFIX = "[ERROR] ";


    public static final String ERROR_SIZE = ERROR_PREFIX + "번호 개수를 확인해주세요.";
    public static final String ERROR_DUPLICATED = ERROR_PREFIX + "번호가 중복되었습니다.";
    public static final String ERROR_RANGE_OVER = ERROR_PREFIX + "번호의 범위를 확인 바랍니다.";
    public static final String ERROR_BONUS_RANGE = ERROR_PREFIX + "보너스 번호는 1~45입니다.";
    public static final String ERROR_BONUS_DUPLICATED = ERROR_PREFIX + "보너스 번호가 당첨번호와 중복되었습니다.";
    public static final String ERROR_IS_NOT_DIGIT = ERROR_PREFIX + "0이 아닌, 숫자형태를 입력해주시기 바랍니다.";
    public static final String ERROR_NOT_RANK = ERROR_PREFIX + "없는 랭크입니다.";
    public static final String ERROR_IS_NOT_UNIT = ERROR_PREFIX + "1000원단위인지/0이아닌지 확인 바랍니다.";
}