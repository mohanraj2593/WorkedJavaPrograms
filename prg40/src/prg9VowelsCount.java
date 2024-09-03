public class prg9VowelsCount
{
    public static void main(String[] args) {
        String a="friends";
        int i;
        int count=0;
        String c="";
        for(i=0;i<a.length();i++){
            char b=a.charAt(i);
            if(b=='a'|b=='e'|b=='i'|b=='o'|b=='u'){
                count=count+1;
                c=c+b;


            }
            else{
                System.out.print(b+" ");
            }


        }
        System.out.println();
        System.out.println(count);
        System.out.println(c);

    }
}
