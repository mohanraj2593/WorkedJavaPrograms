public class prg34Leapyear {
    public static void main(String[] args) {
        int year=400;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" is Leap year");

                }
                else{
                    System.out.println(year+" Not a leap Year");
                }

            }
            else{
                System.out.println(year+"Leap Year");
            }

        }
        else{
            System.out.println(year+" not a Leap Year");
        }
    }
}
