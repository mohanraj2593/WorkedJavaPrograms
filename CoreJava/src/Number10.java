public class Number10
{
    public static void main(String[] args) {
        int n=5;
        int i,j;
        int num=5;
        for(i=n;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print("-");

            }
            for(j=i;j<=n;j++){

                System.out.print(j);

            }
            System.out.println();
        }
    }
}
