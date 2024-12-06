//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BiggerAndSmaller {
    private int smaller=Integer.MAX_VALUE;
    private int bigger=Integer.MIN_VALUE;

    public void find(int[] numbers) {
        for (int n : numbers) {
            if (n > bigger) bigger = n;
            else if (n < smaller) smaller = n;
        }
    }
    public int getBigger()
    {
        return bigger;
    }

    public int getSmaller() {
        return smaller;
    }
}
