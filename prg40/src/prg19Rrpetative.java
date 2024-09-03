public class prg19Rrpetative
{
    public static void main(String[] args) {
        String a="Entertainment";
        a=a.toLowerCase();
        char[] arr=a.toCharArray();
        char[] set=new char[arr.length];
        char bed[]=new char[arr.length];
        int setindex=0;
        int bedIndex=0;

        int i,j;


        for(i=0;i<arr.length;i++){
            int temp=0;


            for(j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    temp = 1;
                    break;
                }
            }
            if(temp==1){
                set[setindex]=arr[i];
                setindex++;





            }
            if(temp==0){
                int t=0;
                for (j=0;j<set.length;j++)
                {
                    if(set[j]==arr[i]){
                        t=1;
                        break;

                    }
                }
                if(t==0){
                    bed[bedIndex]=arr[i];
                    bedIndex++;

                }
            }
        }
        for(i=0;i<bed.length;i++){
            System.out.print(bed[i]+" ");

        }
    }
}




































//public class prg19Rrpetative {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,1,2,3,4};
//        int[] fr=new int[arr.length];
//        int i,j;
//        int visited=-1;
//        for(i=0;i<arr.length;i++){
//            int count=1;
//            for(j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count=count+1;
//                    arr[j]=visited;
//                    break;
//
//                }
//            }
//            if(fr[i]!=visited){
//                fr[i]=count;
//
//            }
//
//        }
//        for(i=0;i<arr.length;i++) {
//            if (arr[i] != visited) {
//                System.out.println(arr[i] + "=" + fr[i]);
//
//            }
//        }
//
//
//
//    }
//}
