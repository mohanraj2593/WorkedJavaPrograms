public class Besant17MidDeleting
{
    public static void main(String[] args) {
        int i;
        int arr[] = {10,20,30,40,50};
        int n=arr.length-1;
        int brr[] = new int[n];
        int index=2;
//        int value=20;
//        for(i=0;i<n;i++){
//            if(arr[i]!=n){
//                index
//            }

//        }
        for(i=0;i<index;i++)
        {
            brr[i]=arr[i];
        }
        for( i=n;i>index;i--)
        {
            brr[i-1]=arr[i];
        }
        for(i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");

        }
    }
}
