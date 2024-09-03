public class prg7FindBigSecondWord {
    public static void main(String[] args) {
        String a="55 4 2 1 3";
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
        String sec=e[0];
        for(j=0;j<length;j++) {
            if (e[j].length() > large.length()) {
                sec=large;
                large=e[j];


            }
        }
        System.out.println(large);
        System.out.println(sec);
        System.out.print(small);


    }
}
