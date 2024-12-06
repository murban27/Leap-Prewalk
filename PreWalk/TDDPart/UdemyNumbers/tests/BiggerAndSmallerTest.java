import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class FirstTest {

    static BiggerAndSmaller biggerAndSmaller;
    @BeforeAll
    public static void Ini() {
        biggerAndSmaller=new BiggerAndSmaller();
        biggerAndSmaller.find(new int[]{19, 2, 5, 6, 9, 6, 0});
    }
    @Test

    public void firstLowestTest()
    {


        Assertions.assertEquals(0,biggerAndSmaller.getSmaller());

    }
    @Test
    public void getHightTest()
    {
        Assertions.assertEquals(19,biggerAndSmaller.getBigger());
    }
    @Test
    public void getHightNegativeTest()
    {
        Assertions.assertNotEquals(15,biggerAndSmaller.getBigger());
    }

}
