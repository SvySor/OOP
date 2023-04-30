package org.example;

import java.util.List;

public class BoxWithNumbers<T extends Number> {
    private List<T> numbers;

    public BoxWithNumbers(List<T> numbers) {
        this.numbers = numbers;
    }

    public List<T> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<T> numbers) {
        this.numbers = numbers;
    }

    public Double average() {
        Double sum = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i).doubleValue();
        }
        return sum / numbers.size();
    }

    public boolean compareAverage(BoxWithNumbers <? extends Number> arg){
        return this.average() > arg.average();
    }
}
