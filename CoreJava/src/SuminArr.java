import java.util.Scanner;
public class SuminArr
{
    public static void main(String[] args) {

        int  t1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int n = sc.nextInt();
        int t;
        for (int i = 1; i <= n; i++) {


            System.out.println("Enter Number");
            t = sc.nextInt();

            if (40 <= t && t <= 70) {
                t1 = t1 + t;
                System.out.println("The Array is" + t1);
            }else {
                continue;
            }
        }




    }
}

