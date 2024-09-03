public class Gcd2
{
    public static void main(String[] args) {
        int n1=12;
        int n2=30;
        int gcd=0;
        int temp;
        while(n2!=0){
            temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        gcd=n1;
        System.out.println(gcd);
    }
}
