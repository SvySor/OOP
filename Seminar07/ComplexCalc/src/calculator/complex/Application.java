package calculator.complex;

public class Application {
    public static void main(String[] args) {
        ComplexCalculatorController calc = new ComplexCalculatorController(new ComplexCalculatorFactory(), new CalculatorViewImpl());
        calc.run();
    }
}
