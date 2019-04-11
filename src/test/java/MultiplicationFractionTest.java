import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationFractionTest {
    @Test
    public void zero_times_zero_equals_zero() {
        Fraction fractionZero = new Fraction(0, 1);

        Fraction result = fractionZero.times(fractionZero);

        assertThat(result).isEqualTo(fractionZero);
    }
}
