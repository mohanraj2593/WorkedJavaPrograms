public class Besant17CopyArray
{
    public static void main(String[] args) {
        int[] n = {10,20,11,12,9};
        int c[]=new int[n.length];
        for(int i=0;i<n.length;i++)
        {
            c[i]=n[i];
        }
        System.out.println();
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
