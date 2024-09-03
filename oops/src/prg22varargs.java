public class prg22varargs {
    static int minval(int... vals){ //varialbe lenght Arguments
        int min1=Integer.MAX_VALUE;
        for(int k:vals) {
            if (k < min1) {//you can store different DataType


                min1 = k;

            }
        }
        return min1;

    }
    public static void main(String[] args) {
        int m=minval(1,2,3,4);
        System.out.println(m);

    }
}
