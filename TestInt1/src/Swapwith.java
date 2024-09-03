import java.util.Scanner;

public class Swapwith
{
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int n1 =sc.nextInt();
        System.out.println("Enter theSecond Number");
        int n2=sc.nextInt();
        System.out.println("Before Swapping:"+n1+" "+n2);
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After Swapping:"+n1+" "+n2);

    }
}
