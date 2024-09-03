import com.sun.nio.sctp.SctpChannel;

import java.util.Scanner;
public class Arrayfor
{
    public static void main(String[] args) {
        int sum=0;
        int mul=1;
        int avg=0;
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter the Total Size of Array:");
        int n=sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<numbers.length;i++){

            System.out.println("Enter The Array Value:"+i);
            numbers[i]= sc.nextInt();
            sum=sum+numbers[i];
            mul=mul*numbers[i];



        }
        for(int i=0;i<numbers.length;i++) {

            System.out.print(numbers[i]+" ");

        }
        avg=sum/numbers.length;
        System.out.println();
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(avg);


        }


    }

