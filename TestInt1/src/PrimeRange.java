public class PrimeRange
{
    public static void main(String[] args) {
        int fn=11;
        int ln=15;

        while(fn<=ln){
            int temp=0;
            for (int i = 2; i <= (fn / 2); i++) {
                if (fn % i == 0) {
                    temp = 1;
                    break;
                }


            }
            if (temp == 0) {
                System.out.println(fn);
            }
            fn++;
        }




    }
    }

