public class prg30Pattern {
    public static void main(String[] args) {
        int row=5;
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<row;j++){
                System.out.print("*"+" ");

            }
            System.out.println();

        }
        for(i=1;i<row+1;i++) {
            for (j = 1; j < i + 1; j++) {
                System.out.print("*" + " ");

            }
//            for(j=i;j<row-1;j++){
//                System.out.print("-"+" ");
//
//            }
            System.out.println();
        }
        System.out.println();

            for(i=1;i<row+1;i++){
                for(j=i;j<row;j++){
                    System.out.print("-"+" ");

                }
                for(j=1;j<i+1;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        System.out.println();
        for(i=1;i<row+1;i++){
            for(j=i;j<row+1;j++){
                System.out.print("*"+" ");

            }
            for(j=1;j<i;j++){
                System.out.print("-"+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(i=1;i<row+1;i++){

            for(j=1;j<i;j++){
                System.out.print("-"+" ");

            }
            for(j=i;j<row+1;j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }


    }
}
