public class Program {
    public static void main(String[]args)
    {
        BiggerAndSmaller biggerAndSmaller=new BiggerAndSmaller();
        biggerAndSmaller.find(new int[]{19,2,5,6,9,6,0});
        System.out.println(biggerAndSmaller.getBigger());
        System.out.println(biggerAndSmaller.getSmaller());

    }
}
