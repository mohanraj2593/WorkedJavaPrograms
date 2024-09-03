class Box9{
    int length;
    int breadth;
    int height;
//    void setDimension(int l,int b,int h){
//        length=l;
//        breadth=b;
//        height=h;
//
//
//    }
    Box9(int l,int b,int h){//data and method Binding
        length=l;
        breadth=b;
        height=h;

    }
    int volume(){
        return length*breadth*height;
    }
}


public class prg19Enapsulation {
    public static void main(String[] args) {
        Box9 blackBox=new Box9(5,4,3);
        System.out.println(blackBox.volume());//Encapsulation


    }
}
