public class prg13 {
    public static void main(String[] args) {
        int arr[]={8,4,1,9,6,2};
        int i,j;
        int max=0;

//        for(i=0;i<arr.length;i++){
//            if(max<arr[i]){
//                max=arr[i];  //19
//            }
//        }
        for(i=0;i<arr.length;i++){
            int big=Integer.MAX_VALUE;
            for(j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    if(arr[j]<big){
                        big=arr[j];

                    }
                }

            }
            if(big!=Integer.MAX_VALUE){
                System.out.print(arr[i]+"->"+big+", ");

            }
            else{
                System.out.print(arr[i]+"->"+" .");
            }
        }
    }
}
