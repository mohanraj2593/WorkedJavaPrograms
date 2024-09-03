import java.util.Scanner;

public class Suminarr2 {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the total number of elements");
        n=sc.nextInt();
        int[] arr=new int[50];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];

        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]);
        }
        System.out.println(sum);

    }

}
