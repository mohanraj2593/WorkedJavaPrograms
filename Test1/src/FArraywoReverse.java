public class FArraywoReverse
{
    public static void main(String[] args) {
        int i;
        int[] arr={10,20,30,40,50};
        int[] brr=new int[arr.length];
        int j=arr.length-1;
        int count=0;
        for(i=arr.length-1;i>=0;i--){
            brr[i]=arr[count];
            count++;
        }
        for(i=0;i<brr.length;i++)
        {
            System.out.print(brr[i]+" ");

        }

    }
}
