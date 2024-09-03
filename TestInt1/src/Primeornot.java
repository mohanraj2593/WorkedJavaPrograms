public class Primeornot
{
    public static void main(String[] args) {
        int n=11;
        int temp=0;
        for(int i=2;i<(n/2);i++)
        {
            if(n%i==0){
                temp=1;
                break;

            }
        }
        if(temp==1)
        {
            System.out.println("It is not palindrome"+n);
        }
        else{
            System.out.println(" Prime");
        }
    }
}
