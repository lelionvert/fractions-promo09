import org.junit.Assert;
import org.junit.Test;

public class PlusFractionTests {

    @Test
    public void test() {
        Assert.assertTrue(true);
    }

    @Test
    public void zero_plus_zero() {
        Fraction fractionZero = new Fraction(0,1);

        Fraction result = fractionZero.add(fractionZero);

        Assert.assertEquals(fractionZero, result);
    }
}
