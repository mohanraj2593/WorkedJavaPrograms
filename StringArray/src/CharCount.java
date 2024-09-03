public class CharCount
{
    public static void main(String[] args) {
        String s="aaabccccbbb";
        int counta=0;
        int countb=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                counta++;

            }
            else if(ch=='b'){
                countb++;
            }

        }
        System.out.println(counta+"-"+countb);
    }
}
