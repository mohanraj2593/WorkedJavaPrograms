public class Number2
{
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);

            }
            for (j=i;j<=n-1;j++)
            {
                System.out.print(1);
            }
            System.out.println();

        }
    }
}
