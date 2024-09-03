public class Perfectornot
{
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<=(n/2);i++){
            int rem=n%i;
            if(rem==0){
                System.out.println(i);
                sum=sum+i;

            }



        }
        if(sum==n){
            System.out.println("perfect Number"+sum);

        }
        else{
            System.out.println("Not a perfect nunber"+sum);
        }
    }
}
