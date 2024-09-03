public class Prg21ReverseNumber
{
    public static void main(String[] args) {
        int n=145;
        while (true) {

            int t=n;
            int result=0;
            while (t > 0) {
                int rem = t % 10;
                result = (result * 10) + rem;
                t = t / 10;
            }
            if (result == n) {
                System.out.println(n+ " Palindrome Number");
                break;

            } else {
                System.out.println(n + "Not a Plaindrome");
                n=n+1;

            }
        }


    }
}
