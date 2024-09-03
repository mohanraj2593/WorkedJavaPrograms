public class Beant19MoveZeroEndArray2
{
    public static void main(String[] args) {
        int[] a={0,1,0,12,3};
        int nz=0;
        int z=0;
        for(int i=0;i<a.length;i++){
            if(a[nz]!=0){
                int temp=a[nz];
                a[nz]=a[z];
                a[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }


        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
