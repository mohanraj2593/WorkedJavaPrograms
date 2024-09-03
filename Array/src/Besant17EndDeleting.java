public class Besant17EndDeleting
{
    public static void main(String[] args) {
        int i;
        int[] arr={10,20,30,40,50};
        int n=arr.length-1;
        int[] brr = new int[n];
        for(i=0;i<n;i++){
            brr[i]=arr[i];

        }

        for(i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");

        }
    }
}
