package OOP3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prg37TryCatch {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;
        try {
//            int arr[]=null;
//            System.out.println(arr[1]);
            c=a/b;

        }
        catch (ArithmeticException e){
            System.out.println("Occure Arithmatic Exception");
        }
        catch(NullPointerException e ){
            System.out.println("Occure NullPointer Exception");
        }
        catch (Exception e){
            System.out.println("Error Occured");
        }
        finally{
            System.out.println("Finnally Block");
        }
        File file = new File("abc.text");
        try {
            FileInputStream fs = new FileInputStream(file);
        }
        catch (FileNotFoundException e){
//            e.printStackTrace();
            System.out.println("Error");
        }


        System.out.println(c);
        System.out.println("Bye");
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            i = sc.nextInt();
        }
        System.out.println(i);

    }
}
