public class gcd1
{
    public static void main(String[] args) {
        int n1=50;
        int n2=60;
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;

            }
            else {
                n2=n2-n1;
            }

        }
        System.out.println(n1);
    }
}
