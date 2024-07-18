package hello;

import hello.Calculator;

public class HelloWorld {
    public static void main(String[] args) {
      Calculator calculator = new Calculator();
      int sum = calculator.add(1, 2);
      System.out.println(sum);
    }
}