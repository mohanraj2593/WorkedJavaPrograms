public class prg1Stringreverese {
    public static void main(String[] args) {
        String a="Mohanraj";
        char[] b=a.toCharArray();
        int j=b.length-1;
        for(int i=0;i<b.length/2;i++)
        {

            char temp=b[i];
            b[i]=b[j];
            b[j]=temp;
            j=j-1;



        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }


    }
}
