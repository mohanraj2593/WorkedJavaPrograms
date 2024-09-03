import java.lang.Math;
public class oddoreven
{
    public static void main(String[] args) {
        int n=153;
        int s1=n;
        int temp=n;
        int count=0;
        while(n>0){
            n=n/10;
            count++;

        }
        int digit=0;
        while(temp>0){
            int rem=temp%10;
            digit=(int)(digit+(Math.pow(rem,count)));
            temp=temp/10;
        }
        if(digit==s1){
            System.out.println("It is Armstrong Number");

        }
        else{
            System.out.println("It is Not a Armstrong Number");
        }


    }
}
