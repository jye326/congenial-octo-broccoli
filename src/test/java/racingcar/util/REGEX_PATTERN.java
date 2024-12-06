package racingcar.util;

public enum REGEX_PATTERN {

    // 정규식 테스트 사이트 링크 : https://regex101.com/
    // 정규식 참고 사이트 링크 : https://adjh54.tistory.com/104#google_vignette

    SPACE(" "),
    COMMA(","),
    PURCHASE_VALIDATE_PATTERN("\\[[\\w가-힣]+-\\d+](,\\[[\\w가-힣]+-\\d+])*"),
    YN_VALIDATE_PATTERN("[YN]"),   // Y또는N, YN은 아님
    // 문자 5글자 이내가 1회 이상 반복, {1부터 5글자}만
    CAR_NAMES_PATTERN("^([a-z|A-Z|가-힣]{1,5},)*([a-z|A-Z|가-힣]{1,5})$")
;
    private final String regexPattern;

    REGEX_PATTERN(String regexPattern) {
        this.regexPattern = regexPattern;
    }
    public String getRegexPattern() {
        return regexPattern;
    }

}