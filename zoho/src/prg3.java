public class prg3 {
    public static void main(String[] args) {
        String s1="   Hardware never fails   ";
        int i,j;
        int t=0;
        String a="";
        for(i=0;i<s1.length()-1;i++){

            char ch=s1.charAt(i);
            if(ch!=' '){
                a=a+ch;
                t=1;

            }
            else{
                if(t==1 ){
                    if(s1.charAt(i+1)!=' ') {


                        a = a + " ";
                        t = 0;
                    }


                }

            }

        }
        System.out.println(a);

    }
}
