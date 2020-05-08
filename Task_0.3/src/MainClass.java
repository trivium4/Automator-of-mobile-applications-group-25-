import org.junit.Assert;
import org.junit.Test;

public class MainClass
{
    @Test
    public void testGetClassString() {
        String a = this.getClassString();
        String firstWord = a.substring(0, 5);

        import static org.junit.Assert;


        if (firstWord.contains("Hello")){
            System.out.println("В тексте первое слово \"Hello\"");
        } else if (firstWord.contains("hello")) {
            System.out.println("В тексте первое слово \"hello\"");
        } else {
            Assert.assertTrue("Первое слово отличается от \"Hello\" или \"hello\"",  firstWord == "hello" ^ firstWord =="Hello");
        }

    }

    private String getClassString() {
    }
}
