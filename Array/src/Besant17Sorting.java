public class Besant17Sorting
{

    public static void main(String[] args) {
        int i;
        int max=0;
        int arr[] = {10,25,13,12,9,65};
        for(int j=0;j<arr.length;j++) {

            for (i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }

        for(i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }


    }
}

