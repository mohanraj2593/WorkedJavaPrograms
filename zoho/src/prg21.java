public class prg21 {

    public static void main(String[] args) {
        String s = "babcddc";
        prg21 obj = new prg21();
        String output = obj.max_num_character(s);
        System.out.println(output);
        System.out.println(output.length());

    }
    private static String substring1(String s,int s1,int t)
    {
        int l=0;
        String d="";
        for(int i=s1;i<t;i++){
            d=d+s.charAt(i);
        }
        return d;
    }
    private String max_num_character(String s){
        int big=0;
        String a="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(big<substring1(s,i+1,j).length()){
                        a=substring1(s,i+1,j);
                        big=a.length();
                        i=j-1;
                        break;
                    }
                }
            }
        }
        return a;
    }
}


