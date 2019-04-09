import org.junit.Assert;
import org.junit.Test;

public class PlusFractionTests {

    @Test
    public void jordan_s_contribution() {
        Assert.assertTrue(true);
    }

    @Test
    public void zero_plus_zero() {
        Fraction fractionZero = new Fraction(0, 1);

        Fraction result = fractionZero.add(fractionZero);

        Assert.assertEquals(fractionZero.getNumerator(), result.getNumerator());
    }

    @Test
    public void zero_plus_integer() {
        Fraction fractionZero = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fractionZero.add(fraction);

        Assert.assertEquals(fraction.getNumerator(), result.getNumerator());
    }

    @Test
    public void integer_plus_zero() {
        Fraction fractionZero = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fraction.add(fractionZero);

        Assert.assertEquals(fraction.getNumerator(), result.getNumerator());
    }

    @Test
    public void integer_plus_integer() {
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fraction.add(fraction);

        Fraction expected = new Fraction(2, 1);
        Assert.assertEquals(expected.getNumerator(), result.getNumerator());
    }

    @Test
    public void fraction_plus_fraction_with_same_denominator() {
        Fraction fraction = new Fraction(1, 3);

        Fraction result = fraction.add(fraction);

        Fraction expected = new Fraction(2, 3);
        Assert.assertEquals(expected.getNumerator(), result.getNumerator());
        Assert.assertEquals(expected.getDenominator(), result.getDenominator());
    }
}
