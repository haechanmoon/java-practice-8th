package utils;

public class Validator {
    public static void validateNameLength(String name) {
        if(name.length()>5){
            throw new IllegalArgumentException("[ERROR] 이름은 5자 이하여야합니다.");
        }
    }

    public static void validateIsBlank(String input) {
        if(input.isBlank()){
            throw new IllegalArgumentException("[ERROR] 값을 입력해주세요.");
        }
    }

    public static void validaIsDigit(String input) {
        if(!input.matches("\\d+")){
            throw new IllegalArgumentException(("[ERROR] 숫자형태로 입력해주세요."));
        }
    }

    public static void validateUpper(int turn) {
        if(turn<1){
            throw new IllegalArgumentException("[ERROR] 1이상의 수를 입력해주세요.");
        }
    }
}
