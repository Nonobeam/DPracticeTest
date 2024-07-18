package app;

import java.util.List;
import java.util.ArrayList;

public class Calculator2 {

    public int prefixSum(List<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;

    }
}