public class prg18Distinctvalues1
{
    public static void main(String[] args) {
        String a="MMMohannnrraj ";
        int i,j;
        String b="";
        for(i=0;i<a.length()-1;i++) {
            char a1 = a.charAt(i);
            if (a.charAt(i) != a.charAt(i+1)) {
                System.out.print(a1 + " ");

            }
        }
        System.out.println(b);
    }
}
