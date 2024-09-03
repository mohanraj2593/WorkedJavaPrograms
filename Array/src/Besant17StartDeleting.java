public class Besant17StartDeleting
{

    public static void main(String[] args) {
        int i;
        int index=1;
        int arr[] ={10,20,30,40,50};
        int brr[]=new int[arr.length-1];
        for(i=0;i<arr.length-1;i++){
            brr[i]=arr[i+1];

        }
        for(i=0;i<brr.length;i++){
            System.out.println(brr[i]);

        }
    }
}

