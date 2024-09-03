import java.util.Scanner;

public class powerwo
{
    public static void main(String[] args) {
        int result=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Value");
        int base=sc.nextInt();
        System.out.println("Enter the Exponent Value");
        int exponent=sc.nextInt();
        while(exponent!=0) {
             result =base*result;
            --exponent;
        }
        System.out.println(result);
    }
}
