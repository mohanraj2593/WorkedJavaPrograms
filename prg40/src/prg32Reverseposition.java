public class prg32Reverseposition
{
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int i;
        int high=arr.length-1;
        for(i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[high];
            arr[high]=temp;
            high=high-1;

        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
