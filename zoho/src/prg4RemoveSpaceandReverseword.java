public class prg4RemoveSpaceandReverseword {
    public static void main(String[] args) {
        String s="  Sunday is Today   ";
        String s1="";
        String s2="";
        int i,j;
        int k=0;
        for(i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                s1=ch+s1;
                k=1;
            }if(ch==' '){
                if(k==1) {
                    if (s2=="") {
                        s2 = s2 + s1;
                        s1 = "";
                        k = 0;
                    }
                    else{
                        s2 = s2 + " " + s1;
                        s1 = "";
                        k = 0;

                    }

                }
            }
        }
        System.out.println(s2);
    }
}
