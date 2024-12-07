package racingcar.view;

import java.util.ArrayList;
import racingcar.domain.Car;
import racingcar.util.OUTPUT_MESSAGE;

public class OutputView {
    // 일반 출력
    public static void askCarNames() {
        System.out.println(OUTPUT_MESSAGE.ASK_CAR_NAMES);
    }
    public static void askTryTimes() {
        System.out.println(OUTPUT_MESSAGE.ASK_TRY_TiMES);
    }
    public static void printWinners(ArrayList<String> winnersName) {
        System.out.print("최종 우승자 : ");
        System.out.println(String.join(", ", winnersName));
    }

    // 나중에 상수화
    public static void printRound(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            for (int i=0;i<car.getProgress();i++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
