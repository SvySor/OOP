package calculator.complex;

public interface CalculatorView {

        public ComplexNumber getFirstArgProcess();

        public ComplexNumber getSecondArgProcess();

        public OperationsType getOperationProcess();

        public void printResult(ComplexNumber result);

        public boolean continueCalc();
}
