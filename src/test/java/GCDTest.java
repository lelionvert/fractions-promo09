import org.junit.Assert;
import org.junit.Test;

public class GCDTest {

    @Test
    public void gcdTest() {
        int i = 6;
        int j = 2;

        int result = GCD.gcdThing(i, j);

        Assert.assertEquals(2, result);
    }
}