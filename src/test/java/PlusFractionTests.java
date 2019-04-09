import org.junit.Assert;
import org.junit.Test;

public class PlusFractionTests {

    @Test
    public void jordan_s_contribution() {
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

    @Test
    public void fraction_plus_zero() {
        Fraction fractionZero = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fraction.add(fractionZero);

        Assert.assertEquals(fraction, result);

    }

    @Test
    public void integer_plus_integer() {
        Fraction fraction = new Fraction(1, 1);
        Fraction expected = new Fraction(2, 1);

        Fraction result = fraction.add(fraction);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void fraction_plus_fraction_with_same_denominator() {
        Fraction fraction = new Fraction(1, 3);
        Fraction expected = new Fraction(2, 3);

        Fraction result = fraction.add(fraction);

        Assert.assertEquals(expected, result);
    }
}
