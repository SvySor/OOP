package calculator.complex;

public class ComplexCalculator extends Calculator {

    private ComplexNumber result;

    public ComplexCalculator(ComplexNumber result) {
        this.result = result;
    }

    public void add(Number arg) {
        ComplexNumber complexArg = (ComplexNumber)arg;
        result.setReal(complexArg.getReal() + result.getReal());
        result.setImage(complexArg.getImage() + result.getImage());
    }

    public void minus(Number arg) {
        ComplexNumber complexArg = (ComplexNumber)arg;
        result.setReal(complexArg.getReal() - result.getReal());
        result.setImage(complexArg.getImage() - result.getImage());
    }

    public void mult(Number arg) {
        ComplexNumber complexArg = (ComplexNumber)arg;
        result.setReal(complexArg.getReal() * result.getReal() - complexArg.getImage() * result.getImage());
        result.setImage(complexArg.getReal() * result.getImage() + result.getReal() * complexArg.getImage());
    }

    public void div(Number arg) {
        ComplexNumber complexArg = (ComplexNumber)arg;
        result.setReal((complexArg.getReal() * result.getReal() + complexArg.getImage() * result.getImage()) /
                (result.getReal() * result.getReal() + result.getImage() * result.getImage())
        );
        result.setImage((complexArg.getImage() * result.getReal() - complexArg.getReal() * result.getImage()) /
                (result.getReal() * result.getReal() + result.getImage() * result.getImage())
        );
    }

    public ComplexNumber getResult() {
        return result;
    }
}
