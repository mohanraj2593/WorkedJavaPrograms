import java.util.Arrays;

public class prg9Anagram
{
    public static void main(String[] args) {
        String a="abcdef";
        String b="bcdea";
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()==b.length())
        {
            char[] a1=a.toCharArray();
            char[] b1=b.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            if(Arrays.equals(a1,b1)){
                System.out.println("If the Arryas are Anagram");

            }
            else{
                System.out.println("If the two arrays are not Anagram");
            }

        }
        else{
            System.out.println("Both String are not Anagram");
        }
    }
}
