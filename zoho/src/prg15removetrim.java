public class prg15removetrim {
    public static void main(String[] args) {
        String s1="   Harwork Never Fails   ";
        int f=0;
        int l=s1.length()-1;
        boolean a=false;
        boolean b=true;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '&& a==false){
                f=f+1;
            }
            else if(a==false){
                a=true;
            }
            if(s1.charAt(l)==' '&&b==false){
                l=l-1;
            }
            else if(b==false){
                b=true;
            }
            if(a==true && b==true){
                break;

            }

        }
        for(int i=f;i<l;i++){
            System.out.print(s1.charAt(i)+"");

        }


    }
}
