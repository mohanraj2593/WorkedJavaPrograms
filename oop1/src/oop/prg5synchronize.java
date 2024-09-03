package oop;
class Table{
    synchronized void printTable(int n){
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }

    }
}

public class prg5synchronize {
    public static void main(String[] args) {
        Table t = new Table();
//        t.printTable(5);
        Thread t1 = new Thread() {
            public void run() {
                t.printTable(5);

            }
        };
            Thread t2 = new Thread(){
                public void run(){
                    t.printTable(10);
                }
            };
        t1.start();
        t2.start();


    }
}
