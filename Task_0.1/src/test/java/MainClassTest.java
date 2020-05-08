import org.testng.Assert;
import org.testng.annotations.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals(getLocalNumber(), 14);
    }
}
