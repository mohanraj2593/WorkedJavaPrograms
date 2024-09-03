import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Arrays;
public class prg3CharOcurenes {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,1,2,3,4};
        String a="Hello";
        char[] arr=a.toCharArray();
        System.out.println(Arrays.toString(arr));
        int[] fr=new int[arr.length];
        int i,j;
        char visited='@';



        for (i=0;i<arr.length;i++){

            int count=1;
            for(j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                    arr[j]=visited;


                }
            }
            if(fr[i]!=visited){
                fr[i]=count;

            }


        }
        for(i=0;i<fr.length;i++){
            if(arr[i]!=visited){
                System.out.println(arr[i]+"="+fr[i]);

            }

        }
    }
}
