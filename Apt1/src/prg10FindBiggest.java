import java.util.Arrays;

public class prg10FindBiggest
{
    public static void main(String[] args) {
        String a = "Hardships often prepare ordinary people for an extraordinary destiny";
        a=a+" ";
        String[] b=new String[100];
        String large="";
        String small="";

        String temp="";
        int i;
        int length=0;
        for (i=0;i<a.length();i++){
            if(a.charAt(i)!=' ') {
             temp=temp+a.charAt(i);
            }
            else{
                b[length]=temp;
                length=length+1;
                temp="";
            }
        }
         small=large=b[0];
        for(int j=0;j<length;j++){
            if(b[j].length()>large.length()){
                large=b[j];

            }
            if(b[j].length()<small.length()){
                small=b[j];

            }

        }
        System.out.println(large);
        System.out.println("Small "+small);

    }
}



//String a="Hello World and think little bird";
//String[] b=a.split(" ");
//        System.out.println(Arrays.toString(b));
//String[] b1=new String[100];
//String max=" ";
//int i;
//        for (i=0;i<b.length;i++){
//        if(b[i].length()>max.length()){
//max=b[i];
//
//        }
//        else{
//
//
//        }
//        }
//        System.out.println(max);
//        System.out.println(i);
