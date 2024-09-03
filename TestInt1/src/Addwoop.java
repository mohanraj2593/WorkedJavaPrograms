public class Addwoop
{
    public static void main(String[] args) {
        int a=10;
        int b=11;
        int sum=0;
        int carry=0;
        while(b!=0)
        {
            sum=a^b;
            carry=(a&b)<<1;
            a=sum;
            b=carry;
        }
        System.out.println(sum);
    }
}
