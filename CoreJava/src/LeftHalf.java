public class LeftHalf
{
    public static void Left(int n)
    {
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("-");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //LeftHalf Pyramid
        int n=3;
        Left(n);

    }
}
