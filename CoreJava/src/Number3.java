public class Number3
{
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(i);

            }
            for(j=i;j<=n-1;j++){
                //j<n or j<=n-1
                System.out.print(1);

            }
            System.out.println();
        }
    }
}
