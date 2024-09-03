public class prg23FindBiggestNumber
{
    public static void main(String[] args) {
        int[] arr={-1,20,10,30,40,1,0,-1,-2,-3};
        int i,j;
        int max=0;
        int sec=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec=max;
                max=arr[i];

            } else if (sec<arr[i]&&max!=arr[i]) {
                sec=arr[i];

            }

        }
        System.out.println(max);
        System.out.println(sec);
    }
}
