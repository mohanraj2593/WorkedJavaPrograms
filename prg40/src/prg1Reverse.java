public class prg1Reverse
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        for(i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j=j-1;

        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
