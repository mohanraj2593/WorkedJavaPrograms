public class prg12ArmstrongNumber
{
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int num1=num;

        int count=0;
        while(num>0){
            num=num/10;
            count=count+1;
        }
        int rem=0;
        int result=0;
        while(temp>0){
            rem=temp%10;
            result=result+(int)(Math.pow(rem,count));
            temp=temp/10;
        }
        if(result==num1){
            System.out.println(num1+" This is a Armstrong Number");
        }
        else{
            System.out.println(num1+" This is Not a Armstrong Number");
        }
    }
}
