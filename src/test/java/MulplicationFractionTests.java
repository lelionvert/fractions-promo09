import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MulplicationFractionTests {
    @Test
    public void zero_times_zero_equals_zero() {
        Fraction fraction = new Fraction(0, 1);

        Fraction result = fraction.times(fraction);
        Fraction expected = new Fraction(0, 1);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
