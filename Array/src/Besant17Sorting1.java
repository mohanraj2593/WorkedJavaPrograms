public class Besant17Sorting1
{
    public static void main(String[] args) {
        int[] arr={5,3,1,7,6};
        int temp=0;
        int j;
        for(j=0;j<arr.length;j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
