package calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        String inputFormula = CalculatorView.inputString();

        CalculatorService calculatorService = new CalculatorService(inputFormula);
        calculatorService.checkSymbol();
        CalculatorView.showResult(calculatorService.calculateSplitedString());
    }
}
