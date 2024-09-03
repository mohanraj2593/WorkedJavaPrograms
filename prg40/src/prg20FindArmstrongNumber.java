public class prg20FindArmstrongNumber{
    static int pow(int base,int pow1){
        int res=1;
        for(int i=0;i<pow1;i++){
            res=res*base;

        }
        return res;


    }
    static void Arms1(int lower,int upper){

        for(int i=lower;i<upper;i++) {

            int result = 0;
            int t = i;
            int t1 = i;
            int count = 0;
            int rem = 0;


            while (t > 0) {
                t = t / 10;
                count = count + 1;
            }
            while (t1 > 0) {
                rem = t1 % 10;
                result = result + pow(rem, count);
                t1 = t1 / 10;
            }
            if(result==i){
                System.out.println(i+" Is Armstrong Number");

            }

        }


    }

    public static void main(String[] args) {
        int lower=1;
        int upper=1000;
        Arms1(lower,upper);


    }
}
