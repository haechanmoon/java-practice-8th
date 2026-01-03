package utils;

public class Messages {
    public static final String PRINT_START_MESSAGES = "안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.";
    public static final String REQUEST_DATE = "12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)";
    public static final String REQUEST_MENU = "주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)";
    public static final String PRINT_EVENT_PREVIEW = "12월 3일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!\n";
    public static final String PRINT_ORDERD_MENU = "<주문 메뉴>";
    public static final String PRINT_BEFORE_SALE = "\n<할인 전 총주문 금액>";
    public static final String PRINT_BONUS_MENU = "<증정 메뉴>";
    public static final String PRINT_SHAM = "샴페인 1개";
    public static final String NO_BONUS = "없음";
    public static final String PRINT_TOTAL_BENEFIT = "<혜택 내역>";
    private static final String ERROR_PREFIX = "[ERROR] ";
    public static final String ERROR_IS_BLANK = ERROR_PREFIX + "값을 입력해 주세요";
    public static final String ERROR_IS_NOT_DIGIT = ERROR_PREFIX + "숫자만 입력해주세요";
    public static final String ERROR_IS_NOT_DATE = ERROR_PREFIX + "숫자의 범위를 확인해주세요.";
    public static final String ERROR_NO_MENU = ERROR_PREFIX + "없는메뉴입니다.";
}
