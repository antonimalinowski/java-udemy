import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    /**
     * In the case of maintaining state by instance of a Calculator class
     */
//    private Calculator calc;

//    @Before
//    public void setUp() throws Exception {
//        calc = new Calculator();
//    }

    @Test
    public void canAddZeroPlusZero() {
        int sum = calc.add(0, 0);
        assertEquals(0, sum);
    }

    @Test
    public void canAddOnePlusOne() {
        int sum = calc.add(1, 1);
        assertEquals(2, sum);
    }
}
