import java.util.Arrays;

public class prg1Ele
{
    public static void main(String[] args) {
        int arr[] = {60,70,80,50,30,40,20,10};//Second element is greater than third element
        Arrays.sort(arr);
        int i;
        int temp;
        for(i=1;i<arr.length-1;i+=2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
