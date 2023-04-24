package calculator.complex;

public class ComplexNumber extends Number {
    private Double real;
    private Double image;

    public ComplexNumber(Double real, Double image) {
        this.real = real;
        this.image = image;
    }

    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public Double getImage() {
        return image;
    }

    public void setImage(Double image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "(" + real + ") + " +
                "i" + "(" + image +
                ")";
    }
    @Override
    public int intValue() {
        return real.intValue();
    }

    @Override
    public long longValue() {
        return real.longValue();
    }

    @Override
    public float floatValue() {
        return real.floatValue();
    }

    @Override
    public double doubleValue() {
        return real;
    }
}
