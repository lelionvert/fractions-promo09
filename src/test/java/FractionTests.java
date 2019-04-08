import org.junit.Assert;
import org.junit.Test;

import java.util.Queue;

public class FractionTests {

    @Test
    public void test() {
        Assert.assertTrue(true);
    }

    @Test
    public void kernel_test()
    {
        Fraction fraction= new Fraction(0,1);
        Assert.assertEquals(fraction,fraction.add(fraction));
    }
}
