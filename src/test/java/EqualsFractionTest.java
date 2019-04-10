import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EqualsFractionTest {

    @Test
    public void equals_fraction_with_same_value() {
        Fraction fraction = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(1, 3);

        assertEquals(fraction2, fraction);
    }

    @Test
    public void equals_with_different_values() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);

        assertNotEquals(fraction1, fraction2);
    }

    @Test
    public void equals_zeros_with_different_denominator() {
        Fraction fraction1 = new Fraction(0, 8);
        Fraction fraction2 = new Fraction(0, 9);

        assertEquals(fraction1, fraction2);
    }
}
