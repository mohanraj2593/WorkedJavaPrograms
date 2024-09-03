public class prg14FinPrime1 {
    public static void main(String[] args) {
        int lower=10;
        int upper=100;
        int count=0;
        int i,j;

        for(i=lower;i<upper;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;

                }
                else{
                    System.out.println(i);
                    break;
                }

            }


        }

    }
}
