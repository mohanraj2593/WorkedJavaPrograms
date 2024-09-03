class A{
    void display(){
        System.out.println("From class A");
    }
}
class B{
    void display(){
        System.out.println("From Class B");
    }
}
class C extends B{

}


public class prg31MutipleinherDemo {
    public static void main(String[] args) {
        C c = new C();
        c.display();


    }
}
