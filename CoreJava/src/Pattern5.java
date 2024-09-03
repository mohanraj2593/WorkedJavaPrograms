public class Pattern5
{
    //Hallow Triangle
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++){
                if(i==1||j==1||i==n||j==n||i==j)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("- ");
                }

            }
            System.out.println();
        }
    }
}
