import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * F = R * { [ (1 + r / n ) ^ ( n * t ) + 1 ] / ( r / n ) }
     */
    public String calculateAnnuity(String R, int t, String r, int n) {
        BigDecimal a = new BigDecimal(r).divide(new BigDecimal(n), RoundingMode.valueOf(2));
        BigDecimal b = a.add(BigDecimal.ONE);
        BigDecimal c = b.pow(n * t);
        BigDecimal d = c.subtract(BigDecimal.ONE);
        BigDecimal e = d.divide(a, RoundingMode.valueOf(2));
        BigDecimal f = e.multiply(new BigDecimal(R));
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        return currencyInstance.format(f);
    }
}
