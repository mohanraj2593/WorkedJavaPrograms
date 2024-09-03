public class besant17DescendingDirect
{
    public static void main(String[] args) {
        int temp=0;
        int[] arr={10,23,35,44,12,56};
        for(int j=0;j<arr.length;j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
