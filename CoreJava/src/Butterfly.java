public class Butterfly {
    public static void Butter(int n) {
        int i, j;
        for (i = 1; i <n; i++) {
            for (j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            for (j = i; j <=n; j++) {

                    System.out.print("- ");


            }



            for (j = i; j <= n; j++) {

                    System.out.print("- ");


            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("- ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("- ");
            }
            for(j=i;j<=n;j++)
            {
                System.out.print("* ");
            }

            System.out.println();

        }







    }

        public static void main (String[]args){
            int n = 5;
            Butter(n);

        }
    }

