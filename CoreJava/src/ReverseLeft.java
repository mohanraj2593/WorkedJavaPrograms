public class ReverseLeft
{
    public static void RevLeft(int n)
    {
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       int n=5;
      RevLeft(n);
    }
}
