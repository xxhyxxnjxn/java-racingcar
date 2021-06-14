package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingGameTest {
    private Cars cars = new Cars();

    @Test
    public void 레이싱게임_객체생성() {
        RacingGame racingGame = new RacingGame("a,b", 5);
        assertThat(racingGame).isInstanceOf(RacingGame.class);
    }

    @DisplayName("이름을 입력하면 자동차가 생성된다.")
    @ParameterizedTest
    @ValueSource(strings = {"현진,진현"})
    public void createCarInformationTest(String input) {
        String[] carNames = input.split(",");
        for (String carName : carNames) {
            cars.addCars(carName);
        }
        assertThat(cars.getCars().get(0).getName()).isEqualTo("현진");
        assertThat(cars.getCars().get(1).getName()).isEqualTo("진현");
    }

    @Test
    public void 레이싱게임_시작() {
        RacingGame racingGame = new RacingGame("a,b", 5);
        racingGame.race();

        assertThat(true).isEqualTo(racingGame.isEnd());
    }
}
