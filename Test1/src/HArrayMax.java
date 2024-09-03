public class HArrayMax {
    public static void main(String[] args) {
        int i;
        int[] arr={10,9,7,4,5,19};
        int max=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }

        }
        System.out.println(max);
    }
}
