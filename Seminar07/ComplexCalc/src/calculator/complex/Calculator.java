package calculator.complex;

public abstract class Calculator {

    private Number result;

    public Calculator(Number result) {
        this.result = result;
    }

    public Calculator(){
    }

    public abstract void add(Number arg);

    public abstract void minus(Number arg);

    public abstract void mult(Number arg);

    public abstract void div(Number arg);

    public abstract Number getResult();
}
