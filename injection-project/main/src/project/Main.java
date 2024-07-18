package project;

import app.Calculator1;
import app.Calculator2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cal 1: ");
        Calculator1 calculator = new Calculator1();
        int sum = calculator.add(1, 2);
        System.out.println(sum);

        System.out.println("Cal 2: ");
        Calculator2 calculator2 = new Calculator2();
        List<Integer> numList = new ArrayList<Integer>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        int prefixSum = calculator2.prefixSum(numList);
        System.out.println(prefixSum);
    }
}