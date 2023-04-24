package calculator.complex;

public class ComplexCalculatorFactory {
    public ComplexCalculator create(ComplexNumber firstArg){
        return new ComplexCalculator(firstArg);
    }
}
