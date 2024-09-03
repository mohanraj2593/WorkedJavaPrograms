package OOP3;
abstract class Memember{
    String name;
    abstract void WelcomeMessage();
}
class Students extends Memember{
    void WelcomeMessage() {
        System.out.println("Hello Student");

    }
}
class Teacher extends Memember{
    void WelcomeMessage() {
        System.out.println("Hello Teacher");

    }
//    void sum(){
//        System.out.println(1+2);
//    }
}
public class prg36Abstract {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.WelcomeMessage();
        Teacher t1 = new Teacher();
        t1.WelcomeMessage();
//        t1.sum();

        System.out.println();

        Memember m1 = new Students();
        Memember[] m3 = new Memember[4];
        m3[0] = new Students();
        m3[1]= new Students();
        m3[2] = new Teacher();
        m3[3] = new Teacher();
        for(Memember m:m3){
            m.WelcomeMessage();

        }

    }
}
