public class BArrayCount
{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println("Count:"+count);
        int a=arr.length;
        System.out.println(arr.length);
    }
}
