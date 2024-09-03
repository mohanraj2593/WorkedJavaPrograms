public class Besant18UniqueElement
{
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,1,4};
                 //0,1,2,3,4,5,6
        int[] brr=new int[arr.length];
        int[] crr=new int[arr.length];
        int bindex=0;
        int cindex=0;
        for(int i=0;i<arr.length;i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp = 1;
                    break;

                }
            }

            if (temp == 1) {
                brr[bindex] = arr[i];
                bindex++;
            }
            if(temp==0){
                int t=0;
                for(int j=0;j<brr.length;j++) {
                    if (arr[i] == brr[j]) {
                        t = 1;
                        break;

                    }
                }
                if( t==0){
                    crr[cindex] = arr[i];
                    cindex++;
                }
            }

        }
        for(int i=0;i<cindex;i++){
            System.out.print(crr[i]);

        }







//        for( int i=0;i<brr.length;i++) {
//            if (temp==1) {
//
//                System.out.print(brr[i] + " ");
//
//            }
//        }

    }
}
