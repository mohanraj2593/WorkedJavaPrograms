package OOP3;
class Cycle{
    void display(){
        System.out.println("I am a Cycle");
    }
}
class TriCycle extends Cycle{
//    void display(){
//        System.out.println("I am a TriCycle");
//    }
}

public class Prg37Anonymous {
    public static void main(String[] args) {
//        Cycle c = new TriCycle();
        Cycle c = new Cycle(){
            void display(){
                System.out.println("I am a TriCycle");
            }

        };
        c.display();



    }
}
