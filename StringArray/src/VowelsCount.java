public class VowelsCount
{
    public static void main(String[] args) {
        String s="aaabccccbbb";
        int counta=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'){
                counta++;


            }

        }
        System.out.println(counta);
    }
}
