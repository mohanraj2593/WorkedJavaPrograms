import java.lang.Math;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Value");
        int base=sc.nextInt();
        System.out.println("Enter the Exponent Value");
        int exponent=sc.nextInt();
        double  result=(double)(Math.pow(base,exponent));
        System.out.println(result);
    }
}
