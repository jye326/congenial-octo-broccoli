package racingcar.controller;

import java.util.ArrayList;
import racingcar.model.Race;
import racingcar.view.OutputView;
import racingcar.view.UserInputView;

public class RacingController {
    public void startRace() {
        OutputView.askCarNames();
        UserInputView userInputView = new UserInputView();
        ArrayList<String> carNames =  userInputView.readCarNames();
        Race race = new Race(carNames);
        OutputView.askTryTimes();
        race.tryRace(userInputView.readTryTimes());
        OutputView.printWinners(race.getWinners());
    }
}
