public class prg13Reversenumber
{
    public static void main(String[] args) {
        int arr=153;
        int rem=0;
        int result=0;
        while(arr>0){
            rem=arr%10;
            result=(result*10)+rem;

            arr=arr/10;


        }
        System.out.println(result);

    }
}
