import java.util.Scanner;

public class PrimeFactor {
    public static void main(String args[]) {
        int n = 12;
        System.out.println("Entered number"+n);
        for (int i=2;i<n;i++) {
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>2){
            System.out.println(n);

        }
    }
}
