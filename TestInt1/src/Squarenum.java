import java.lang.Math;
public class Squarenum {
    public static void main(String[] args) {
        float n=3;
        float result;
        result=n*n;
        float result1=n*n*n;
        System.out.println(n);
        System.out.printf("Square of %.2f",result);
        System.out.println();
        System.out.printf("Cube of %.2f",result1);
        System.out.println();
        System.out.printf("%.2f",Math.sqrt(n));
        double a=result;
        System.out.printf("%.2f",Math.sqrt(result));

    }
}
