package utils;

import java.security.PublicKey;

public class Messages {
    private static final String ERROR_PREFIX = "[ERROR] ";

    public static final String ERROR_SIZE = ERROR_PREFIX+"로또 번호는 6개여야 합니다.";
    public static final String ERROR_NUMBER_DUPLICATED = ERROR_PREFIX+"숫자가 중복되었습니다.";
    public static final String ERROR_NUMBER_RANGE = ERROR_PREFIX+"번호의 범위를 넘어섰습니다.";
    public static final String ERROR_IS_NOT_LOTTO_UNIT = ERROR_PREFIX+"구입금액을 확인하시기 바랍니다.";
    public static final String ERROR_BONUS_ALREADY_IN = ERROR_PREFIX+"보너스 번호가 이미 당첨 번호에 포함되었습니다.";
    public static final String ERROR_INPUT_BLANK = ERROR_PREFIX+"값을 입력해주세요.";
    public static final String ERROR_IS_NOT_DIGIT = ERROR_PREFIX+"숫자를 입력해주세요."
            ;
    public static final String REQUEST_MONEY = "구입금액을 입력해 주세요.";
    public static final String REQUEST_WINNING_NUMBERS = "당첨 번호를 입력해 주세요.";
    public static final String PRINT_LOTTOS_HEADER = "%n%d개를 구매했습니다.";
    public static final String REQUEST_BONUS_NUMBER = "\n보너스 번호를 입력해 주세요.";
    public static final String PRINT_STATISTICS_HEADER = "\n당첨통계\n---";
    public static final String PRINT_SECOND_STATISTICS = "%d개 일치, 보너스 볼 일치 (%,d원) - %d개";
    public static final String PRINT_STATISTICS = "%d개 일치 (%,d원) - %d개";
    public static final String PRINT_WIN_RATE = "총 수익률은 %.1f%%입니다.";
}
