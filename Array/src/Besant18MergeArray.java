public class Besant18MergeArray
{
    public static void main(String[] args) {
        int[] a={10,20,30};
        int[] b={40,50};
        int c1=a.length+b.length;
        int[] c=new int[c1];
        int i;

        for(i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        //Other Method
//        int j=b.length-1;
//        for (i=c.length-1;i>=a.length;i--){
//            c[i]=b[j];
//            j--;
//        }
        for(i=0;i<c.length;i++){
            System.out.print(c[i]+" ");

        }

    }
}
