import static java.lang.Character.*;

public class StringUpper
        {
            public static void main(String[] args) {
                String s="WelCoMe";
                String w="";

                for(int i=0;i<s.length();i++){
                    char ch=s.charAt(i);
                    if(Character.isUpperCase(ch)) {
                        ch = Character.toLowerCase(ch);
                        w=w+ch;

                    }
                    else {
                        ch=Character.toUpperCase(ch);
                        w=w+ch;
                    }


                }
                System.out.println(w);

            }

}
