class Box2{
    int length;
    int breadth;//instance variable
    int height;
    int volume(){
        return length*breadth*height;

    }
}


public class prg7invokingmethodwithobject
{
    public static void main(String[] args) {
        Box2 a=new Box2();
        a.length=10;//local variable
        a.height=12;
        a.breadth=14;
        System.out.println(a.volume());//Method invoking with Object

    }
}
