public class RightHalf {
    //RightHalf Pyramid
    public static void R1(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            int n=5;
            R1(n);

    }


    }

