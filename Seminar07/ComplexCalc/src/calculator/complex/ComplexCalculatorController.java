package calculator.complex;

public class ComplexCalculatorController {

    private ComplexCalculatorFactory factory;
    private CalculatorView view;

    public ComplexCalculatorController(ComplexCalculatorFactory factory, CalculatorView view) {
        this.factory = factory;
        this.view = view;
    }

    public void run() {
        while (true) {
            ComplexNumber primaryArg = view.getFirstArgProcess();
            ComplexCalculator calculator = factory.create(primaryArg);
            while (true) {
                OperationsType cmd = view.getOperationProcess();
                ComplexNumber arg;
                switch (cmd) {
                    case SUM:
                        arg = view.getSecondArgProcess();
                        calculator.add(arg);
                        break;
                    case SUB:
                        arg = view.getSecondArgProcess();
                        calculator.minus(arg);
                        break;
                    case MUL:
                        arg = view.getSecondArgProcess();
                        calculator.mult(arg);
                        break;
                    case DIV:
                        arg = view.getSecondArgProcess();
                        calculator.div(arg);
                        break;
                }
                if (cmd.equals(OperationsType.EQ)) {
                    view.printResult(calculator.getResult());
                    break;
                }
            }
            boolean cnt = view.continueCalc();
            if (cnt) {
                continue;
            }
            break;
        }
    }
}