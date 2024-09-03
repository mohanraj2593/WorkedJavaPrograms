public class prg7Secondmax
{
    public static void main(String[] args) {
        int[] arr={1,99,5,6,2,3,4};
        int i,j;
        int temp=0;
//        int size=arr.length;
//        for(i=0;i<arr.length;i++){
//            for(j=i+1;j<arr.length;j++) {
//                if(arr[i]>arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//
//            }
//        }
//        System.out.println("Second Largest Element:"+arr[size-2]);
        int max=999;
        int Sec=max;
        for(i=0;i<arr.length;i++){


            if(arr[i]<max){
                Sec=max;
                max=arr[i];

            }
            else if(arr[i]<Sec  && arr[i]!=max){
                Sec=arr[i];

            }
        }
        System.out.println(max);
        System.out.println(Sec);

    }
}
