public class prg4sum {
    static int sum(int n){
        int t=n;
        int rem=0;
        int result=0;
        while(t>0) {
            rem = t % 10;
            result = (result*10) + rem;
            t = t / 10;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(sum(1000));
        System.out.println(sum(123));
        System.out.println(sum(151));



    }
}
