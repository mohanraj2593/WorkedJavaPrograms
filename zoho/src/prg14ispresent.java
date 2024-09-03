public class prg14ispresent {
    public static void main(String[] args) {
        String s1="sundayi is Fundays";
        String s2="is";
        String s3="";
        int i;
        int j=0;
        int count=0;
        for(i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
                char ch1=s2.charAt(j);
                if(ch==ch1){
                    count=count+1;
                    j=j+1;
                    if(s2.length()==count){
                        System.out.println(true);
                        break;
                    }
                }
                else{
                    count=0;
                    j=0;
                }

        }


    }
}
