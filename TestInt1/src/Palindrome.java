public class Palindrome
{
    public static void main(String[] args) {
        int num=121;
        int temp=num;
        int digit=0;
        while(temp>0){
            int rem=temp%10;
            digit=(digit*10)+rem;
            temp=temp/10;


        }
        if(digit==num){
            System.out.println("It is a Palindrome:"+digit);
        }
        else {
            System.out.println("It is Not a Palindrome");
        }
        System.out.println(digit);
    }
}
