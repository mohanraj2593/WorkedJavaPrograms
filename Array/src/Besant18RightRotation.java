public class Besant18RightRotation
{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int i;
        int rotation=2;
        for(int j=0;j<rotation;j++) {
            int temp = arr[0];
            for (i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];

            }
            arr[arr.length-1]=temp;
        }

        for(i=0;i<arr.length;i++) {

            System.out.print(arr[i]+" ");

        }
    }
}
