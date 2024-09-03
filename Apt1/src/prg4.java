public class prg4
{
    public static void main(String[] args) {
        String n="hello world in my chennai";
//        String a=Ord("A");
//        System.out.println(a);
        String b=n.replaceAll("\\s","");
        String d=n.replace(" ","");
        String res="";
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(!Character.isWhitespace(c)){
               res=res+c;

            }


        }
        System.out.println(d);
        System.out.println(b);
        System.out.println(res);
    }
}
