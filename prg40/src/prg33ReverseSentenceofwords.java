public class prg33ReverseSentenceofwords {
    public static void main(String[] args) {
        String a1="India is Dveloping Contry";
        a1=a1+" ";
        String[] b1=new String[a1.length()];
        String d="";

        int b1ind=0;
        int i;
        for(i=0;i<a1.length();i++){
            char c=a1.charAt(i);
            if(a1.charAt(i)!=' '){
                d=d+a1.charAt(i);

            }
            else{
                b1[b1ind]=d;
                b1ind=b1ind+1;
                d="";
            }


        }
        int last=b1ind-1;

        for(i=0;i<b1ind/2;i++) {
            String temp = b1[i];
            b1[i] = b1[last];
            b1[last] = temp;
            last=last-1;


        }
        for(i=0;i<b1ind;i++){
            System.out.print(b1[i]+" ");

        }

    }
}
