import java.util.Scanner;

public class prg8Leapyear
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter theYear");
        int year=sc.nextInt();
        int i;
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
                System.out.println(year+" is a leap yeap");
            }

        }
        else{
            System.out.println(year+" is not a Leap Year");

        }
    }
}
