package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void addCars(String carName) {
        cars.add(new Car(carName));
    }

    public void move(RacingRandom racingRandom) {
        this.cars.stream().forEach(car -> car.move(racingRandom.isMove()));
    }

    public List<Car> selectWinners() {
        int winnerLocation = selectWinnerLocation();

        return this.cars.stream()
                .filter(car -> car.isMatchedWinnerLocation(winnerLocation))
                .collect(Collectors.toList());
    }

    private int selectWinnerLocation() {
        return this.cars.stream()
                .mapToInt(Car::getLocation)
                .max()
                .getAsInt()
                ;
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(this.cars);
    }
}
