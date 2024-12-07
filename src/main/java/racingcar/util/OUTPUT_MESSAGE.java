package racingcar.util;

public enum OUTPUT_MESSAGE {
    // 일반 정적 출력 문구 예시
    ASK_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ASK_TRY_TiMES("시도할 횟수는 몇 회인가요?"),

    doubleTab("\t\t"),
    // format 사용한 가변 출력 문구 예시
    PAY_AMOUNT("내실돈\t\t\t %s")

    ;
    private final String message;

    OUTPUT_MESSAGE(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    // 주어진 인자를 순서대로 해당 포멧에 채워 넣음
    public String format(Object... args) {
        return String.format(message, args);
    }
}
