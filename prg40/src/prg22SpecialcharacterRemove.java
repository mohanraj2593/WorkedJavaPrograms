public class prg22SpecialcharacterRemove {
    public static void main(String[] args) {
        String a="Mohanraj$%%#Ind$%5ia";
        int i;
        String c="";
        for(i=0;i<a.length();i++){
            char b=a.charAt(i);
            if((b>64 && b<91)||(b>96 && b<123)){
                c=c+b;
                System.out.print(b+"");

            }


        }
        System.out.println();
        System.out.println(c);
    }
}
