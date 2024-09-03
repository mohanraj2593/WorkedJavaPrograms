package OOP3;

public class prg35JavaInner {
    public static void main(String[] args) {
        outer o1 = new outer();
        o1.outerdisplay();
        outer.inner i1 = new outer.inner();
        i1.innerdisplay();


    }
}
class outer{
    int num;
    void outerdisplay(){
        System.out.println("Outer Display");
    }
    static class inner{
        int x;
          void innerdisplay(){
            System.out.println("Inner Display");

        }
    }
}
