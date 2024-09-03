public class prg5
{
    public static void main(String[] args) {
        char a='{',b='}';
        int count=5;
        int i,j;
        int k=0;
        for(i=0;i<count;i++){
            for(j=0;j<=i;j++){
//                System.out.print(1+" ");
                for(k=0;k<=j;k++){
                    System.out.print(a+" ");

                }
                for(k=0;k<=j;k++){
                    System.out.print(b+" ");

                }


            }
            System.out.println();

        }
    }
}
