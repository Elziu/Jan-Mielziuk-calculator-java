package com.kodilla;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 5);
        double result = calculator.addAToB();
        System.out.println(result);
    }
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double addAToB() {
         return a + b;
    }

    public double subtractAFromB() {
         return a - b;
    }
}
