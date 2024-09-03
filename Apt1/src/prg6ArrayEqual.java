import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Arrays;
public class prg6ArrayEqual {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5};
        int[] brr = {1, 2, 3, 4,4,5};
//        Arrays.sort(arr);
//        Arrays.sort(brr);
//        if (arr.length == brr.length) {
//            if (Arrays.equals(arr, brr)) {
//                System.out.println("Equal");
//
//            } else {
//                System.out.println("Not Equal");
//            }
//        }
        int i,j;
        boolean equalornot=true;
        if(arr.length==brr.length){
            for(i=0;i<arr.length;i++){
                if(arr[i]!=brr[i]){
                    equalornot=false;
                }
            }
        }
        else{
            equalornot=false;
        }
        if(equalornot){
            System.out.println("Equal");

        }
        else{
            System.out.println("Not Equal");

        }
    }
    }
