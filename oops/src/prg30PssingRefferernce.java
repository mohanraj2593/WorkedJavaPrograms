import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class prg30PssingRefferernce
{
    int length;
    int height;
    int breadth;
    static void increement(int a){
        a++;


    }
    prg30PssingRefferernce(int l,int b,int h) {
        length =l;
        height =h;
        breadth = b;
    }
    boolean isEqual(prg30PssingRefferernce b){
        b.length++;
        if(length==b.length && height==b.height && breadth==b.breadth){
            return true;
        }
        return false;

    }
//    prg30PssingRefferernce(int l,int b,int h){
//        length=b.length;
//        height=b.height;
//        breadth=b.breadth;
//
//    }

    public static void main(String[] args) {
        int a=10;
        increement(a);
        increement(a);
        System.out.println(a);
        prg30PssingRefferernce b1=new prg30PssingRefferernce(5,4,3);
        System.out.println(b1.length);
        prg30PssingRefferernce b2=new prg30PssingRefferernce(5,4,3);
        System.out.println(b1.isEqual(b2));
        System.out.println(b2.length);


    }
}
