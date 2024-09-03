import java.util.Arrays;
//using array and built-in funtion
public class LargeNumber {
    public static int getLargest(int [] a,int total){
        Arrays.sort(a);
        return a[total-1];


    }

    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println("Largest"+getLargest(a,3));
    }
}
