import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class PlusFractionTest {

    @Test
    public void jordan_s_contribution() {
        assertTrue(true);
    }

    @Test
    public void zero_plus_zero() {
        Fraction fractionZero = new Fraction(0, 1);

        Fraction result = fractionZero.add(fractionZero);

        assertThat(result).isEqualTo(fractionZero);
    }

    @Test
    public void zero_plus_integer() {
        Fraction fractionZero = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fractionZero.add(fraction);

        assertThat(result).isEqualTo(fraction);
    }

    @Test
    public void integer_plus_zero() {
        Fraction fractionZero = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fraction.add(fractionZero);

        assertThat(result).isEqualTo(fraction);
    }

    @Test
    public void integer_plus_integer() {
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fraction.add(fraction);

        Fraction expected = new Fraction(2, 1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void fraction_plus_fraction_with_same_denominator() {
        Fraction fraction = new Fraction(1, 3);

        Fraction result = fraction.add(fraction);

        Fraction expected = new Fraction(2, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void fraction_plus_zero() {
        Fraction fraction = new Fraction(7, 8);
        Fraction fractionZero = new Fraction(0, 1);

        Fraction result = fraction.add(fractionZero);

        assertThat(result).isEqualTo(fraction);
    }

    @Test
    public void zero_plus_fraction() {
        Fraction fraction = new Fraction(7, 8);
        Fraction fractionZero = new Fraction(0, 1);

        Fraction result = fractionZero.add(fraction);

        assertThat(result).isEqualTo(fraction);
    }

    @Test
    public void fraction_plus_fraction_with_different_denominator() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);

        Fraction result = fraction1.add(fraction2);

        Fraction expected = new Fraction(5, 6);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void fraction_plus_fraction_with_different_denominator_triangulation() {
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(2, 7);

        Fraction result = fraction1.add(fraction2);

        Fraction expected = new Fraction(31, 35);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void simplify
            () {
        Fraction fraction = new Fraction(2, 6);

        Fraction expected = new Fraction(1, 3);
        assertThat(fraction).isEqualTo(expected);
    }

    @Test
    public void simplify_fraction_plus_fraction() {
        Fraction fraction = new Fraction(7, 2);

        Fraction result = fraction.add(fraction);

        Fraction expected = new Fraction(7, 1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void fraction_should_return_positive_one_if_equivalent() {
        Fraction fraction1 = new Fraction(-1, -4);

        Fraction expected = new Fraction(1, 4);
        assertThat(fraction1).isEqualTo(expected);
    }

    @Test
    public void negative_fraction_should_have_negative_numerator() {
        Fraction fraction = new Fraction(1, -4);

        Fraction expected = new Fraction(-1, 4);
        assertThat(fraction).isEqualTo(expected);
    }

    @Test
    public void fraction_zero_is_not_negative() {
        Fraction fraction = new Fraction(0, -1);

        Fraction expected = new Fraction(0, 1);
        assertThat(fraction).isEqualTo(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fraction_with_denominator_equal_zero_throw_illegal_argument_exception() {
        Fraction fraction = new Fraction(1, 0);
    }
}