package project;

import app.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        System.out.println(sum);
    }
}