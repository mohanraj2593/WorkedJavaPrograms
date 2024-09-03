public class Pyramid
{
    public static void py(int n){
        int i,j;
        //Pyramid Above and Below
//        for (i=1;i<n;i++){
//            for(j=i;j<=n;j++){
//                System.out.print("- ");
//
//            }for(j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            for(j=1;j<i;j++)
//            {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }

        //Reverse Pyramid Above and Below
//        for (i=1;i<n;i++){
//            for(j=1;j<=i;j++){
//                System.out.print("- ");
//
//            }for(j=i;j<=n;j++)
//            {
//                System.out.print("* ");
//            }
//            for(j=i;j<n;j++)
//            {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }
//        for (i=1;i<=n;i++){
//            for(j=i;j<=n;j++){
//                System.out.print("- ");
//
//            }for(j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            for(j=1;j<i;j++)
//            {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }




        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(j=i;j<=n;j++)
            {
                System.out.print("-  ");
            }

            for(j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }

        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++){
                System.out.print("* ");

            }
            for(j=1;j<=i;j++)
            {
                System.out.print("  ");
            }

            for(j=i;j<=n;j++){
                System.out.print("* ");

            }
            System.out.println();
        }











    }
    public static void main(String[] args) {
        int n=5;
        py(n);


    }
}
