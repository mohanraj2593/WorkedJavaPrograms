import java.util.Scanner;

public class prg17matadd {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int brr[][]=new int[3][3];
        int crr[][]=new int[arr.length][arr[0].length];
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        System.out.println("Elements of A Matrix");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();

            }

        }
        System.out.println("Elements of B Matrix");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                brr[i][j]=sc.nextInt();

            }

        }


        for(i=0;i<crr.length;i++){
            for(j=0;j<crr.length;j++){
                crr[i][j]=arr[i][j]+brr[i][j];
            }

        }
        for(i=0;i<crr.length;i++){
            for(j=0;j<crr.length;j++) {//crr.length
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
