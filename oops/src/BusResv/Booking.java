package BusResv;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Booking {
    String PassengerName;
    int BusNo;
    Date date;
    Booking(){
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter Name of Passenger:");
        PassengerName = Sc.nextLine();
        System.out.println("Enter Bus No:");
        BusNo = Sc.nextInt();
        System.out.println("Enter dd-MM-yyyy format:");
        String DateInput=Sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(DateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    public boolean isAvailable(ArrayList<Booking> bookings ,ArrayList<Bus> buses){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBusNo()==BusNo)
                capacity=bus.getCapacity();
        }
        int booked=0;
        for(Booking b:bookings){
            if(b.BusNo == BusNo && b.date.equals(date)){
                booked=booked+1;

            }

        }
        return booked<capacity?true:false;

    }
}
