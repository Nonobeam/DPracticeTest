package hello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(3, calculator.add(1, 2));
    }
}