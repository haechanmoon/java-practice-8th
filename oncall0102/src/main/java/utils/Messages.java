package utils;

public class Messages {

    public static final String REQUEST_MONTH_DAY = "비상 근무를 배정할 월과 시작 요일을 입력하세요> ";
    public static final String REQUEST_WEEKDAY_NAMES = "평일 비상 근무 순번대로 사원 닉네임을 입력하세요> ";
    public static final String REQUEST_WEEKEND_NAMES = "휴일 비상 근무 순번대로 사원 닉네임을 입력하세요> ";

    private static final String ERROR_PREFIX = "[ERROR] ";


    public static final String ERROR = ERROR_PREFIX + "올바르지 않은 값입니다.";
    public static final String ERROR_NAME_LENGTH = ERROR_PREFIX + "이름이 너무 깁니다.";
    public static final String ERROR_MANY_PEOPLE = ERROR_PREFIX + "사람이 너무 많습니다.";
    public static final String ERROR_NAME_DUPLICATED = ERROR_PREFIX + "이름이 중복되었습니다.";
    public static final String ERROR_BLANK_NAME = ERROR_PREFIX + "이름중 빈값이 있습니다.";
    public static final String ERROR_IS_BLANK = ERROR_PREFIX + "값을 입력해주세요.";
}
