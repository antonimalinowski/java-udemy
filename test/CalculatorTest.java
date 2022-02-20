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

    @Test
    public void canAddMaxIntPlusOne() {
        int sum = calc.add(Integer.MAX_VALUE, 1);
        System.out.println(sum); // -2147483648
//        System.out.println(0b01111111111111111111111111111111); // 2147483647
//        System.out.println(0b01111111111111111111111111111111 + 0b1); // -2147483648
//        System.out.println(0b10000000000000000000000000000000); // -2147483648
        assertEquals(Integer.MAX_VALUE + 1l, sum);
        /**
         * 1 is no longer an integer (32 bits), but a long (64 bits).
         * By doing so Integer.MAX_VALUE + 1l will be of type long which has much more room to "grow".
         * Therefore there will be no carry.
         */
    }
}
