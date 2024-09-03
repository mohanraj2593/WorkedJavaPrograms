import java.util.Scanner;

public class Sumrec
{

    static int sum=0, rem1;
    static int sum(int n){
        int temp=n;
        int rem=temp%10;
        sum=sum+rem;
        rem1=temp/10;
        if(rem1>0){
            sum(rem1);
        }
            return sum;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =sc.nextInt();

        int result=sum(n);
        System.out.println(result);
        System.out.println(n/result);
    }
}
