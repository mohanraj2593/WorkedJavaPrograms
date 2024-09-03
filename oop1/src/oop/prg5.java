package oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prg5 {
    public static void main(String[] args) {
    int a=10;
    int b=0;
    int c=0;
    try{ //to check code is error or not
        //if not execute code output otherwise throw the error
        c=a/b;
        int arr[]=null;//unchecked Exception
        System.out.println(arr[1]);
        throw new NullPointerException("demo");//Custom Exception


    }
    catch (NullPointerException e){
        System.out.println("NullPointerException");

    }
    catch(ArithmeticException e){
        System.out.println("ArithmeticException");

    }
    catch(Exception e){ //else to handle error to which error is Occure
        System.out.println("Program Error");

    }
    finally {
        System.out.println("Finally");
    }
        System.out.println(c);
        System.out.println("Okay");
        File file = new File("abc.txt");
        try {                              //Checked Exception
            FileInputStream fs = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i=0;
        try(Scanner sc = new Scanner(System.in);) {//try with resouce
             i = sc.nextInt();
        }
        System.out.println(i);
        double bal=500,withdraw=700;//custom Exception
        try {
            if (bal < withdraw)
                throw new InsufficientFundEception(withdraw - bal);
        }
        catch(InsufficientFundEception e){
            System.out.println("Not Enough Money");

        }

    }
}
