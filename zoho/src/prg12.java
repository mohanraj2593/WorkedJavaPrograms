public class prg12 {
    public static void main(String[] args) {
        int arr[]={7,6,5,4,3,2,1};
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for(i=1;i<arr.length;i=i+2){
            int temp1=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp1;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }


    }
}
