public class Leapyear {
    public static void main(String[] args) {
        int year=100;
        if(year%400==0){
            System.out.println("Leap Year"+year);
        }
        else if(year%100==0){
            System.out.println("Not Leapyaer"+year);

        }
        else if(year%4==0){
            System.out.println("Leap Year"+year);
        }
        else{
            System.out.println("Not a leap yaer"+year);
        }
    }
}
