public class Besan18Apple
{
    public static void main(String[] args) {
        String a="apple";
        char ch1='a';
        char ch2='p';
        char[] ch=a.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==ch1){
                ch[i]=ch2;
            } else if (ch[i]==ch2) {
                ch[i]=ch1;

            }
        }
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+" ");
        }
    }
}
