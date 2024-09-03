public class prg4Paindromestring
{
    public static void main(String[] args) {
        String a="madam";
        int i;
        String a1="";
        for(i=0;i<a.length();i++){
            char b=a.charAt(i);
            a1=b+a1;

        }
        System.out.println(a);
        System.out.println(a1);
        if(a1.equals(a)){
            System.out.println(a+" String is a Palindrome");

        }
        else{
            System.out.println(a+" Not a Palindrome");
        }
    }
}
