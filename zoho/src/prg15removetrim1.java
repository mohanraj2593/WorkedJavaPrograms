public class prg15removetrim1 {
    public static void main(String[] args) {
        String s1="   Hardwork Never Fails kallanai  ";
        String s2="";
        int t=0;
        for(int i=0;i<s1.length()-1;i++){
            char ch=s1.charAt(i);
            char ch1= s1.charAt(i+1);
            if(ch!=' '){
                s2=s2+ch;
                t=1;
            }
            else{
                if(t==1) {
                    if(ch1!=' ') {
                        s2 = s2 + " ";
                        t = 0;
                    }
                }

            }

        }
        System.out.print(s2);

    }
}
