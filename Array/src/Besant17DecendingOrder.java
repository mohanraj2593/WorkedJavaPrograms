public class Besant17DecendingOrder
{
    public static void main(String[] args) {

int arr[]={15,12,13,10,9};
        int i;
        int temp=0;
        for(int j=0;j<arr.length;j++) {

            for (i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] brr=new int[arr.length];
        for(i=0;i<arr.length;i++)
        {
            brr[i]=arr[i];
        }
        for(i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        int j=brr.length-1;

        for(i=0;i<brr.length/2;i++){
            temp=brr[i];
            brr[i]=brr[j];
            brr[j]=temp;
            j--;
        }
        for(i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }


    }
}
