import java.sql.SQLOutput;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username");
         int userName=sc.nextInt();
        System.out.println("userName is "+userName);
        if(userName>18 && userName<60){
            System.out.println("True");

        } else if (userName<18) {
            System.out.println("Under");

        }
        else {
            System.out.println("Over");
        }
    }

}
