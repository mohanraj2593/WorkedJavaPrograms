public class prg6a5 {
    static String repeat1(char ch,int num){
        String a2 ="";
        for(int i=1;i<=num;i++){
            a2=a2+ch;

        }
        return a2;

    }
    public static void main(String[] args) {
        String s="aa5b2c3";
        s=s+" ";
        int i,j;
        String a1="";
        int num=0;
        int count=0;
        for(i=0;i<s.length();i++){
            char ch = s.charAt(i);
            for(j=i+1;j<s.length();j++){
                char ch1=s.charAt(j);
                if((ch>63 & ch<92)||(ch>96 & ch<122)){
                    if(Character.isDigit(ch1)){
                        num=(num*10)+ch1-48;
                        count=count+1;
                    }
                    else{
                        if((num != 0) || (ch ==' ')){
                            a1=a1+repeat1(ch,num);
                            i=i+count;
                            num=0;
                            count=0;
                            break;
                        }

                    }

                }

            }


        }
        System.out.print(a1+" ");
    }
}
