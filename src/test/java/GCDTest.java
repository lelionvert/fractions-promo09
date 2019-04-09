import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GCDTest {
    @Test
    public void gcd_test() {
        int gcd = GCD.compute(6, 2);

        assertEquals(2, gcd);
    }
}