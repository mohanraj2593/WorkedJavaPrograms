public class Number1
{
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j) {
                    System.out.print(i);

                }else{
                    System.out.print(1);
                }
            }
            System.out.println();

        }
    }
}
