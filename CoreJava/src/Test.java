import java.util.*;

public class Test{
    public static void main(String args[]){
        int n=5;
        int k=1;
        int x=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k +" ");
                k = k+1;
            }
            System.out.println();
        }

        System.out.println();
        for(int i=n; i>=1; i--){
            for(int j=i; j<=n; j++){
               System.out.print(j+ " ");
            }
            for(int j=1; j<i;j++){
                System.out.print("5 ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1;i<=n;i++){
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();


        for(int i=1;i<=n;i++){
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }

            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }






        for(int i=1;i<=n;i++){
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }

            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }


}