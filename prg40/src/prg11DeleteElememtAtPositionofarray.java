public class prg11DeleteElememtAtPositionofarray
{
    public static void main(String[] args) {
        int[] arr={1,2,3,12,11};
        int i;
        int index=0;
        int ele=11;
        int[] brr=new int[arr.length-1];
        for(i=0;i<arr.length;i++){
            if(ele==arr[i]){
                index=i;

            }

        }
        System.out.println(index);
        for (i=0;i<index;i++){
            brr[i]=arr[i];
            System.out.print(brr[i]+" ");

        }
        for (i=index;i<brr.length;i++){
            brr[i]=arr[i+1];
            System.out.print(brr[i]+ "");
        }

    }
}
