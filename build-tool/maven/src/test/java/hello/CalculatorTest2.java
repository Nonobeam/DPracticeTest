package hello;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest2 {
    private Calculator calculator = new Calculator();

    @Test
    public void testMinus() {
        assertEquals(3, calculator.minus(5, 2));
    }
}
