package org.example.app;

import java.util.List;

public class MathLibrary {
    public int add(List<Integer> listNumbers) {
        int sum = 0;
        for (int number : listNumbers) {
            sum += number;
        }
        return sum;
    }
}
