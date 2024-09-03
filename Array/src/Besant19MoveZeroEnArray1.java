public class Besant19MoveZeroEnArray1
{
    public static void main(String[] args) {
        int[] arr={4,0,1,0,3,12,1,9,0,2};
        int index=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                int temp=arr[i];
            for(int j=i+1;j<arr.length;j++){


                    arr[j-1]=arr[j];
                }
            arr[arr.length-1]=temp;

            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
