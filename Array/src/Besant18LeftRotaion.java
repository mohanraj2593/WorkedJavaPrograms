public class Besant18LeftRotaion
{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int rotation=2;
        for(int j=0;j<rotation;j++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
//            System.out.print(i);
            }
            arr[0] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
