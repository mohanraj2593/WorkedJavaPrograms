import java.util.Scanner;

public class ArrayStr
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int n=sc.nextInt();
//        int n=3;
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++){
            Scanner sca = new Scanner(System.in);
            System.out.println("Enter The Value of String Array:"+i);
            arr[i]=sca.nextLine();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

//        Scanner sc=new Scanner(System.in);
//        System.out.println("EnterThe String Array Size Value:");
//        String arr=sc.nextLine();
//        String[] a= new String[10];
    }
}
