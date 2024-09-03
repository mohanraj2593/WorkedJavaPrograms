public class LeapYear {
    public static void main(String[] args) {
        int y=2024;
        //if year divisible by 4==0
        //if year is century not divisible 100!=0 or
        //year divisible by 400==0
        if((y%4==0 && y%100!=0)||y%400==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
