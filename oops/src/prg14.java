class Box7{
    int length;
    int height;
    int breadth;
    void setDim(int l,int h,int b){
        length=l;
        height=h;
        breadth=b;
    }
    Box7(Box7 b){
        length=b.length;
        height=b.height;
        breadth=b.breadth;

    }
    Box7(int l,int h,int b){
        length=l;
        height=h;
        breadth=b;
    }
    int volume(){
        return length*height*breadth;

    }
    boolean isEqual(Box7 b){
        if(length==b.length && height==b.height && breadth==b.breadth){
            return true;
        }
        return false;

    }
}











public class prg14 {
    public static void main(String[] args) {
        Box7 a1=new Box7(2,3,4);
        a1.setDim(1,2,3);
        System.out.println(a1.volume());
        Box7 blackBox=new Box7(5,6,7);
        System.out.println(blackBox.volume());
        Box7 b1=new Box7(5,6,7);
        System.out.println(b1.volume());
        System.out.println("blackBox==b1 "+blackBox.isEqual(b1));
        Box7 b2=new Box7(b1);
        System.out.println(b2.volume());

    }
}
