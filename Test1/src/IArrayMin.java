public class IArrayMin {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,8};
        int i;
        int min=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        System.out.print(min);
    }
}
