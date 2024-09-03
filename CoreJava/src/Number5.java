public class Number5
{
    public static void main(String[] args) {
        int n=5;
        int i,j;
       // other method n-j+1
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(n-j+1);
            }
            System.out.println();

        }
       // other method i-- and j--
//        for(i=n;i>=1;i--){
//            for(j=n;j>=i;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
    }
}
