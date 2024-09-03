public class Besant19MoveZeroEndofArray
{
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int n=arr.length;
        int nz=0;
        int z=0;
        while(nz<n){
            if(arr[nz]!=0){
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }

    }
}
