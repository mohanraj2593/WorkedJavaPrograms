public class prg2Unique
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,2,3,5,4};
        int[] brr=new int[arr.length];
        int[] crr=new int[arr.length];
        int i,j;
        int bindex=0;
        int cindex=0;
        for(i=0;i<arr.length;i++) {
            int temp = 0;
            for (j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 1) {
                brr[bindex] = arr[i];
                bindex = bindex + 1;

            }
            if (temp == 0) {
                int t = 0;
                for (j = 0; j< brr.length; j++) {

                    if (arr[i] == brr[j]) {
                        t = 1;
                        break;
                    }
                }
                if (t == 0) {
                    crr[cindex] = arr[i];
                    cindex = cindex + 1;

                }

            }
        }
            for(i=0;i<cindex;i++){
                System.out.println(crr[i]+" ");

            }



    }
}
