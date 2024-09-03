public class Number7
{
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++)
        {
            for (j=1;j<i;j++) {
                System.out.print(0);

            }
            for (j=i;j<=n;j++){
                System.out.print(1);

            }
            System.out.println();
        }
    }
}
