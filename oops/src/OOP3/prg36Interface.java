package OOP3;



abstract interface veihcle{
    abstract void ride();

    default void display(){
        System.out.println("Hello from ridable Interface");
    }
}
class Car implements veihcle{
    public void ride(){
        System.out.println("You are Riding a Car");
    }
}
class Bike implements veihcle{
    public void ride(){
        System.out.println("Hello From Bike Class");
    }

}
class Mechanic{
    void check(veihcle c){
        System.out.println("Checking...");
        c.ride();

    }
}

public class prg36Interface {
    public static void main(String[] args) {
        Mechanic m = new Mechanic();
        Car c = new Car();
        Bike b = new Bike();
        m.check(c);
        m.check(b);
        veihcle v = new Car();
//        v.display();
        c.display();
        veihcle r2 = new veihcle() {
            public void ride(){
                System.out.println("You are riding a vintage car");
            }
        };
        r2.ride();
        veihcle r3 = ()-> System.out.println("You are riding Convertible interface");
        r3.ride();




    }
}
