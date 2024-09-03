public class prg19pat {
    public static void main(String[] args) {
        char a = '{';
        char b='}';
        int i,j;
        int n=5;
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++) {
                for (int k = 0; k<= j; k++) {
                    System.out.print(a+" ");
//                    System.out.print(b);
                }
                for (int k = 0; k <= j; k++) {
//                    System.out.print(a);
                    System.out.print(b+" ");
                }
            }
            System.out.println( );

        }

        }

}
