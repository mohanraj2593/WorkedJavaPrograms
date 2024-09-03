public class prg11InsertElememtAtPositionofarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] brr=new int[arr.length+1];
        int i,j;
        int index=7;
        int postition=50;
        for(i=0;i<index;i++){
            brr[i]=arr[i];

        }
        for(i=index;i<arr.length;i++){
            brr[i+1]=arr[i];


        }
        brr[index]=postition;
        for(i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }

}
