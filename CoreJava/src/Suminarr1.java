import java.util.Scanner;

public class Suminarr1 {
    public static void main(String[] args) {

        int  t1 = 0;
        int t,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int n = sc.nextInt();
        int  t2 [] = new int[50];
        for (i = 1; i <= n; i++)
        {

            t = sc.nextInt();
            System.out.print("Enter"+t);
            t2[t]=t;

        }

    }

//        int[] originalArray = new int[5]; // Initialize your array with the desired size
//        for (int j= 0; i < 5; j++) {
//            System.out.println("Enter the number");
//            Scanner sc=new Scanner(System.in);
//            int t= sc.nextInt();
//            originalArray[t] = t;
//            System.out.println(originalArray[t]);// Add your elements here
        }



