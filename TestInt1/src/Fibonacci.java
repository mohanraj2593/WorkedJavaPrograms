public class Fibonacci
{
    static void fib(int n){
        int n1=0;
        int n2=1;
        int n3;
        for(int i=0;i<n;i++){
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;

        }
    }
    public static void main(String[] args) {
         int n=10;
      fib(n);



    }
}
