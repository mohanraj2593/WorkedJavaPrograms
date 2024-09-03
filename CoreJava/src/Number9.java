public class Number9
{
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++){
            for (j=i;j<=n-1;j++){
                System.out.print("-");

            }
            for(j=1;j<=i;j++){
                //j<n or j<=n-1
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
