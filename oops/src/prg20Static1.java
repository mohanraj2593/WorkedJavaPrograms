class Box10{
    int length;
    int height;
    int breadth;
    static int boxCount;
    void setDim(int l,int h,int b){
        length=l;
        height=h;
        breadth=b;
    }
    Box10(){
        System.out.println("Empty Box");
        boxCount++;
    }
    Box10(Box10 b){
        length=b.length;
        height=b.height;
        breadth=b.breadth;
        boxCount++;

    }
    Box10(int l,int h,int b){
        length=l;
        height=h;
        breadth=b;
    }
    int volume(){
        return length*height*breadth;

    }
    boolean isEqual(Box10 b){
        boxCount++;

        if(length==b.length && height==b.height && breadth==b.breadth){
            return true;
        }
        return false;

    }
    static{
        System.out.println("From static Block");
        boxCount=0;
    }
    static void displayCount(){
        System.out.println("Box count is "+boxCount);

    }

}



public class prg20Static1 {
    public static void main(String[] args) {
        Box10 blackBox;
        System.out.println("before Creating Bo Object");
        blackBox=new Box10(1,2,3);
        System.out.println("After Creating Box Object");
//        Box10 woodenBox=new Box10(2,3,4);
//        Box10 cardBoardBox=new Box10(3,4,1);
//        Box10 greenBox=new Box10(5,3,5);
        Box10 b1=new Box10(5,6,7);
        Box10 b2=new Box10(5,6,7);
        Box10 c1 = new Box10();
        Box10 c2 = new Box10(b2);
        System.out.println("b1==b2 "+b1.isEqual(b2));
        System.out.println(Box10.boxCount);
        Box10.displayCount();

    }
}
