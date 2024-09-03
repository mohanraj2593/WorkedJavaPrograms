import java.util.Scanner;
public class Besant17PrintArray {
    public static void main(String args[])
    {
        int i;
        int n=5;
        int[] a=new int[n];

            System.out.println("Enter the Array Value");
            Scanner scan = new Scanner(System.in);
            a[0] = scan.nextInt();
            a[1] = scan.nextInt();
            a[2] = scan.nextInt();
            a[3] = scan.nextInt();
            a[4] = scan.nextInt();
            //  a[5]=scan.nextInt();

for(i=0;i<a.length;i++) {
    System.out.print(a[i]+" ");
}


    }
}