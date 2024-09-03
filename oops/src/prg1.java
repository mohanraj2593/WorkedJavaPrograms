public class prg1
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int i;
        int j=arr.length-1;
        int temp=0;
        for(i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=arr[i];
            j-=1;

        }

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
