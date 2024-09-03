package oop;

import java.lang.management.RuntimeMXBean;

//class Book implements Runnable{
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Update Db");
//            try{
//            Thread.sleep(2000);
//            }
//            catch (InterruptedException e){
//                System.out.println("Interrupted Exception");
//            }
//
//
//        }
//
//    }
//}
class num extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Interrupted Exception");
            }

        }
    }
}

public class prg5Multitreading{
    public static void main(String[] args) throws InterruptedException {//Thread
        Runnable b =()->
        {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Update Db");
                    try{
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e){
                        System.out.println("Interrupted Exception");
                    }




            }
        };
        num n = new num();
        Thread t = new Thread(b);

        t.start();
        t.setName("Book1");
        System.out.println( t.getName());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());
        n.start();
//        if(b.isAlive()){
//            System.out.println("Still Running");
//        }
//        b.join();
        n.join();
//        if(b.isAlive()){
//            System.out.println("Still Running");
//        }
        System.out.println("Bye");
    }

    }

