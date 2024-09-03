public class Number4
{
    public static void main(String[] args) {
        int n=5;
        int i,j;
        int num=n;
        //other method n-i+1
//        for(i=1;i<=n;i++){
//            for (j=1;j<=n;j++)
//            {
//                System.out.print(n-i+1);
//            }
//            System.out.println();
//
//        }
        //other method i-- and j--
        for(i=5;i>=1;i--){
            for(j=n;j>=1;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
