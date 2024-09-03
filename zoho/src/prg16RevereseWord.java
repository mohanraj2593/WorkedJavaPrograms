public class prg16RevereseWord {
    public static void main(String[] args) {
        String a="   Today is Holiday   ";
        String b="";
        String st="";
        int t=0;
        for(int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
            if(ch!=' '){
                b=ch+b;
                t=1;
            }
            else{
                if(t==1){
                    if(st=="") {
                        st=st+b;
                        b="";
                        t = 0;
                    }
                    else{
                        st=st+" "+b;
                        b="";
                        t = 0;

                    }

                }

            }


        }
        System.out.print(st);
    }
}
