







public class prg12FibbonacciseriesRecursion1 {
    static int fibbo(int n) {
        if(n<=1) {
            return n;

        }
        return fibbo(n-1)+fibbo(n-2);



    }

    public static void main(String[] args) {
        int n = 5;
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(fibbo(i)+" ");
        }
    }
}
