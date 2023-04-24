package calculator.complex;

import java.util.Scanner;

public class CalculatorViewImpl implements CalculatorView{
    private Scanner sc;

    public CalculatorViewImpl() {
        this.sc = new Scanner(System.in);
    }

    @Override
    public ComplexNumber getFirstArgProcess() {
        System.out.println("Введите действительную часть первого аргумента: ");
        Double x1 = Double.parseDouble(sc.nextLine());
        System.out.println("Введите мнимую часть первого аргумента: ");
        Double x2 = Double.parseDouble(sc.nextLine());
        return new ComplexNumber(x1, x2);
    }

    @Override
    public ComplexNumber getSecondArgProcess() {
        System.out.println("Введите действительную часть второго аргумента: ");
        Double у1 = Double.parseDouble(sc.nextLine());
        System.out.println("Введите мнимую часть второго аргумента: ");
        Double у2 = Double.parseDouble(sc.nextLine());
        return new ComplexNumber(у1, у2);
    }
    @Override
    public OperationsType getOperationProcess() {
        System.out.println("Введите тип операции (+,-,*,/,=): ");
        String sign = sc.nextLine();
        return OperationsType.getOperation(sign);
    }

    @Override
    public void printResult(ComplexNumber result) {
        System.out.println("Результат = " + result);
    }

    @Override
    public boolean continueCalc() {
        System.out.println("Продолжать расчёты? (Y) ");
        String answer = sc.nextLine();
        if (answer.equals("Y")) {
            return true;
        }
        return false;
    }
}
