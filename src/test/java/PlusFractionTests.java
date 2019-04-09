import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlusFractionTests {

    @Test
    public void jordan_s_contribution() {
        assertTrue(true);
    }

    @Test
    public void zero_plus_zero() {
        Fraction fractionZero = new Fraction(0, 1);

        Fraction result = fractionZero.add(fractionZero);

        assertEquals(fractionZero.getNumerator(), result.getNumerator());
    }

    @Test
    public void zero_plus_integer() {
        Fraction fractionZero = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fractionZero.add(fraction);

        assertEquals(fraction.getNumerator(), result.getNumerator());
    }

    @Test
    public void integer_plus_zero() {
        Fraction fractionZero = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fraction.add(fractionZero);

        assertEquals(fraction.getNumerator(), result.getNumerator());
    }

    @Test
    public void integer_plus_integer() {
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fraction.add(fraction);

        Fraction expected = new Fraction(2, 1);
        assertEquals(expected.getNumerator(), result.getNumerator());
    }

    @Test
    public void fraction_plus_fraction_with_same_denominator() {
        Fraction fraction = new Fraction(1, 3);

        Fraction result = fraction.add(fraction);

        Fraction expected = new Fraction(2, 3);
        assertEquals(expected.getNumerator(), result.getNumerator());
        assertEquals(expected.getDenominator(), result.getDenominator());
    }

    @Test
    public void fraction_plus_zero() {
        Fraction fraction = new Fraction(7, 8);
        Fraction fractionZero = new Fraction(0, 1);

        Fraction result = fraction.add(fractionZero);

        assertEquals(fraction, result);
    }

    @Test
    public void zero_plus_fraction() {
        Fraction fraction = new Fraction(7, 8);
        Fraction fractionZero = new Fraction(0, 1);

        Fraction result = fractionZero.add(fraction);

        assertEquals(fraction, result);
    }

    @Test
    public void fraction_plus_fraction_with_different_denominator() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);

        Fraction result = fraction1.add(fraction2);

        Fraction expected = new Fraction(5, 6);
        assertEquals(expected.getNumerator(), result.getNumerator());
        assertEquals(expected.getDenominator(), result.getDenominator());
    }

    @Test
    public void fraction_plus_fraction_with_different_denominator_triangulation() {
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(2, 7);

        Fraction result = fraction1.add(fraction2);

        Fraction expected = new Fraction(31, 35);
        assertEquals(expected.getNumerator(), result.getNumerator());
        assertEquals(expected.getDenominator(), result.getDenominator());
    }

}