public class StringSpaceRemove {
    public static void main(String[] args) {
        String s="This is a word ";
//        String S=s+" ";
        String w="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                w=w+ch;


            }
            else{
                System.out.print(w+"");
                w="";
            }

        }

    }
}
