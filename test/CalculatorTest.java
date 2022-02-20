import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void canAddZeroPlusZero() {
        Calculator calc = new Calculator();
        int sum = calc.add(0, 0);
        assertEquals(0, sum);
    }
}
