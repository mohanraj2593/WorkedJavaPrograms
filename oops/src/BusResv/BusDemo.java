package BusResv;

import java.util.*;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) {
//        Bus bus1 = new Bus();
//        Bus bus2 = new Bus();
//        Bus[] buses=new Bus[50];//Array List - Collection length not mention using arraylist to achieve Efficiency
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        nums.add(5);
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();




        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,48));
        int UserOpt=1;
        for(Bus b:buses){
            b.DisplayBusInfo();

        }
        while(UserOpt==1){
            System.out.println(" Enter 1 to Book and 2 to Exit : ");
            Scanner sc=new Scanner(System.in);
            UserOpt=sc.nextInt();
            if(UserOpt==1){
//                System.out.println("Booking.....");
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is Confirmed...");

                }
                else{
                    System.out.println("Sorry! Bus is Full.Try Anather bus or Date ");
                }

            }

        }
    }
}
