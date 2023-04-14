package org.example;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 0.0, 0.0);
        System.out.println(vector1);
        System.out.println(vector1.vectorLength());

        Vector vector2 = new Vector(0.0, 1.0, 0.0);
        System.out.println(vector1.scalarMulti(vector2));

        System.out.println(vector1.vectorMulti(vector2));

        System.out.println(vector1.vectorAngle(vector2));

        System.out.println(vector1.vectorSumma(vector2));
        System.out.println(vector1.vectorMinus(vector2));
    }
}