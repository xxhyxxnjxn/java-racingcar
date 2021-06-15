package racingcar.domain;

public class Car {
    private static final int CAR_LENGTH = 5;
    private static final String INVALID_NAME_MESSAGE = "자동차의 이름은 5자를 초과할 수 없다.";

    private String name;
    private int location;

    public Car(String name) {
        invalidedName(name);
        this.name = name;
        this.location = 0;
    }

    public void invalidedName(String name) {
        if (name.length() > CAR_LENGTH) {
            throw new IllegalArgumentException(INVALID_NAME_MESSAGE);
        }
    }

    public void move(boolean isMovable) {
        if (isMovable) {
            this.location++;
        }
    }

    public boolean isMatchedWinnerLocation(int winnerLocation) {
        return this.location == winnerLocation;
    }

    public String getName() {
        return this.name;
    }

    public int getLocation() {
        return this.location;
    }

}
