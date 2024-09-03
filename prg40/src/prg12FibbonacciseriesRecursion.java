public class prg12FibbonacciseriesRecursion
{
    public static void main(String[] args) {
        int n=10;

        int f=0;
        int s=1;
        int t;
        int i;
        for(i=0;i<n;i++){
                System.out.print(f + " ");
                t = s + f;
                f = s;
                s = t;





        }
    }
}
