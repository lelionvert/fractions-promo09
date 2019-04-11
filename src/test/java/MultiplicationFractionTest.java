import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationFractionTest {
    @Test
    public void zero_times_zero_equals_zero() {
        Fraction fractionZero = new Fraction(0, 1);

        Fraction result = fractionZero.times(fractionZero);

        assertThat(result).isEqualTo(fractionZero);
    }

    @Test
    public void zero_times_one_return_zero() {
        Fraction fractionZero = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fractionZero.times(fraction);

        assertThat(result).isEqualTo(fractionZero);
    }

    @Test
    public void one_times_zero_return_zero() {
        Fraction fractionZero = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 1);

        Fraction result = fraction.times(fractionZero);

        assertThat(result).isEqualTo(fractionZero);
    }

    @Test
    public void one_times_one_return_one() {
        Fraction fractionOne = new Fraction(1, 1);

        Fraction result = fractionOne.times(fractionOne);

        assertThat(result).isEqualTo(fractionOne);
    }

    @Test
    public void two_times_one_return_one() {
        Fraction fractionOne = new Fraction(1, 1);
        Fraction fraction = new Fraction(2, 1);

        Fraction result = fraction.times(fractionOne);

        assertThat(result).isEqualTo(fraction);
    }

    @Test
    public void two_times_two_return_four() {
        Fraction fraction = new Fraction(2, 1);

        Fraction result = fraction.times(fraction);

        Fraction expected = new Fraction(4, 1);
        assertThat(result).isEqualTo(expected);
    }
}
