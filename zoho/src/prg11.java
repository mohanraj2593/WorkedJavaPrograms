public class prg11 {
    public static void main(String[] args) {
        String s1="anaghrram";
        String s2="anaghrarm";
        String s3="";
        int i;
        int count=0;
        if(s1.length()==s2.length()) {
            for (int j = 0; j < s1.length(); j++) {


                for (i = 0; i < s2.length(); i++) {
                    if (s1.charAt(j) == (s2.charAt(i))) {
                        count = count + 1;
                        System.out.println(count);
                        break;

                    }

                }
            }
            if(count==s1.length()) {
                System.out.println("yes,Anagram");
            }
            else{
                System.out.println("Enter correct size");
            }
        }
        else{
            System.out.println("Length is Not Equal,not anagram");
        }
    }
}
