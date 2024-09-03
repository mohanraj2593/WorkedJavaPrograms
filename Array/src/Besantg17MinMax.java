public class Besantg17MinMax {
    public static void main(String[] args) {
        int arr[] = {10,13,12,15,18};
        int i=0;
        int max=arr[0];

        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }


        }
        int min=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
