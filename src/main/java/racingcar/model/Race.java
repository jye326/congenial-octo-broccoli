package racingcar.model;

import java.util.ArrayList;
import racingcar.domain.Car;
import racingcar.view.OutputView;

public class Race {
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<String> winners = new ArrayList<>();

    public Race(ArrayList<String> carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public void printCars() {
        for (Car car : cars) {
            System.out.println(car.getName());
        }
    }

    public void tryRace(int tryTimes) {
        for (int i = 0; i < tryTimes; i++) {
            for (Car car : cars) {
                car.runOrStop();
            }
            OutputView.printRound(cars);
            System.out.println();
        }
        // 게임 종료 후 우승자 업데이트
        updateWinner();
    }

    public void updateWinner() {
        int maxProgress = 0;
        for (Car car : cars) {
            maxProgress = Integer.max(maxProgress, car.getProgress());
        }
        for (Car car : cars) {
            if (car.getProgress() == maxProgress) {
                winners.add(car.getName());
            }
        }
    }

    public ArrayList<String> getWinners() {
        return this.winners;
    }

}
