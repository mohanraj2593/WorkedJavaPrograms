public class Prmeornot1
{

    static int Pal(int n,int digit){
        int temp=n;


        int rem=0;

        if(n!=0){
            rem=n%10;
             digit=(digit*10)+rem;
             n=n/10;
        }
        else
            return digit;
        return digit;

    }
    public static void main(String[] args) {
        int n=121;
        int digit=0;

        if(digit==n){
            System.out.println("Not a Palindrome");

        }
        else {
            System.out.println("It is a Palinrome");
        }

    }
}
