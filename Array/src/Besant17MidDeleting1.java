public class Besant17MidDeleting1
{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int index=2;
        int i;
        for(i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for(i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);

        }
    }
}
