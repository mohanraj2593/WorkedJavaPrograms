public class Pattern11
{
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
