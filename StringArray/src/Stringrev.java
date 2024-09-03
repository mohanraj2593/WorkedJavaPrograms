public class Stringrev
{
    public static void main(String[] args) {
        String s="hello";
        String w="";
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        w=ch+w;

        }
        System.out.println(w);
        System.out.println(10+20+"Hello");
        System.out.println("hello"+10+20);
    }
}
