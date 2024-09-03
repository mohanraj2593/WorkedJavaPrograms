public class Laepyear1
{
    public static void main(String[] args) {
        int year=400;
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("Leap Yaer"+year);

        }
        else{
            System.out.println("Not a Leap Year"+year);
        }
    }
}
