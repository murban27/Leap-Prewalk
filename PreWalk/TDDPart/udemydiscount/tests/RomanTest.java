import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanTest {
    private Numbers number;
    @Before
    public void setUp()
    {
        number=new Numbers();
    }

    @Test
    public void additionCheckFourteen()
    {
        int cislo=number.getNumbers("XIV");
        int expected=14;
        Assert.assertEquals(expected,cislo);
    }
    @Test
    public void checkBigNumber()
    {
        int cislo=number.getNumbers("MCDXLIV");
        int expected=1444;
        Assert.assertEquals(expected,cislo);

    }
    @Test
    public void CheckCascadeNumbers()
    {
        int cislo=number.getNumbers("XII");
        int expected=12;
        Assert.assertEquals(expected,cislo);

    }
    @Test
    public void CheckIncreasingNumber()
    {
        int cislo=number.getNumbers("XVII");
        int expected=17;
        Assert.assertEquals(expected,cislo);

    }

}
