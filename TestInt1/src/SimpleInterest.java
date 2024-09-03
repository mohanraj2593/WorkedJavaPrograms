import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float p,t,r,SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount First Number");
        p =sc.nextFloat();
        System.out.println("Enter theSecond Time Duration Number");
         t=sc.nextInt();
        System.out.println("Enter the Rate Third Number");
        r =sc.nextInt();
        SI=(p*t*r)/100;
        System.out.println("SI:"+SI);
    }

}
