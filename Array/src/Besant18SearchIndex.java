public class Besant18SearchIndex {

    public static int Remove1(int arr[],int n){
        int i;
        int count = 0;
        for (i = 0; i < arr.length-1 ; i++) {
            if (arr[i] == n)
            {
                count = i;
                 return count;
            }

        }
         return -1;
    }


    public static void main(String[] args) {
        int[] arr = {10, 14, 15, 16, 13, 12};

        int n=16;
        System.out.println("key:"+Remove1(arr,n));




    }
}
