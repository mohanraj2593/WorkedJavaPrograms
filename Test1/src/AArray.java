
import java.util.Scanner;
public class AArray{
public static void main(String args[])

{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Array Size");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the Array Value");
        arr[i]=s1.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]);
    }


}}