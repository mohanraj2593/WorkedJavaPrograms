import java.util.Arrays;
import java.util.Scanner;

public class prg5sort
{
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter The Array Size:");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        int i;
//        for(i=0;i<arr.length;i++){
//            Scanner sc1=new Scanner(System.in);
//            System.out.println("Enter teh Elements:");
//            arr[i]=sc1.nextInt();
//        }
//        for(i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        int[] arr={12,6,5,4,6,1};
        Arrays.sort(arr);

        int i,j;
//        for(i=0;i<arr.length;i++){
//            for(j=i+1;j<arr.length;j++){
//
//                if(arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//
//            }
//
//        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }


    }
}
