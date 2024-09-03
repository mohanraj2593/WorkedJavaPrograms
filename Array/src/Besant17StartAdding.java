public class Besant17StartAdding
{
    public static void main(String[] args) {
        int n=23;
        int[] arr ={10,20,30,24,23,25};
        int[] brr =new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            brr[i+1]=arr[i];
            brr[0]=n;
        }
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
