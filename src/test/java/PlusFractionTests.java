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

    @Test
    public void zero_plus_fraction() {
        Fraction fractionZero = new Fraction(0,1);
        Fraction fraction  = new Fraction(1, 3);
        Fraction result = fractionZero.add(fraction);

        Assert.assertEquals(fraction, result);
    }
}
