package racingcar.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputCarInfo() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return SCANNER.next();
    }

    public static int inputCycle() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return SCANNER.nextInt();
    }

}
