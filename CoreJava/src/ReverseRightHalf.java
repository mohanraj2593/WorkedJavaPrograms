public class ReverseRightHalf
{
    //ReverseRightHalf Pyramid
    public static void Rev(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        Rev(n);
    }
}
