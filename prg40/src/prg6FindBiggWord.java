import java.util.Arrays;

public class prg6FindBiggWord
{
    public static void main(String[] args) {
        String a="India is my country-";
        a=a+" ";
        String small="";
        String large="";
        int length=0;
        String[] e=new String[100];
        String d="";
        int i,j;
        for(i=0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                d=d+a.charAt(i);

            }
            else{
                e[length]=d;
                length=length+1;
                d="";

            }

        }
        small=e[0];
        for(j=0;j<length;j++) {
            if (e[j].length() < small.length()) {
                small=e[j];


            }
        }
        large=e[0];
        for(j=0;j<length;j++) {
            if (e[j].length() > large.length()) {
                large=e[j];


            }
        }
        System.out.println(large);
        System.out.print(small);






    }
//    String a="India is my country";
//    String b[]=a.split(" ");
//        System.out.println(Arrays.toString(b));
//    int c=b.length;
//    String max=b[0];//first value is 0 other is not smaller than 0,so take input min as Big Word
//    int i;
//        for(i=0;i<b.length;i++){
//    if(b[i].length()<max.length()){
//        max=b[i];
//
//
//    }
//}
//        System.out.println(max);
}

