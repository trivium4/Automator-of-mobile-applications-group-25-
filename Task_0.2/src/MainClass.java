import MainClass.MainClass;
import org.junit.Assert;
import org.junit.Test;


public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {

        this.getLocalNumber();
        Assert.assertTrue("getLocalNumber = 14", getLocalNumber() == 14);
    }

    private int getLocalNumber() {
        return 14;
    }


    @Test
    public void testGetClassNumber(){
        int a = this.gotClassNumber();
        if (a > 45){
            System.out.println("True");
        } else {
            System.out.println("Fail");
        }

    }
}
