package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int progress;

    public Car(String name) {
        this.name = name;
        this.progress = 0;
    }

    public void runOrStop() {
        // 나중에 상수 처리
        if (Randoms.pickNumberInRange(0,9) >= 4) {
            this.progress++;
        }
    }

    public String getName() {
        return name;
    }
    public int getProgress() {
        return progress;
    }
}
