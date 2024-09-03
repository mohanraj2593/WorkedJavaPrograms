class Box6{
    int length;
    int height;
    int breadth;
    void setDimension(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
//    void setDimension(int l,int b,int h){
//        length=l;
//        breadth=b;
//        height=h;
//    }
    Box6(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
   int volume(){
        return length*breadth*height;
    }

}
public class prg12ThisPointer {
    public static void main(String[] args) {
        Box6 blackBox=new Box6(1,2,3);
        blackBox.length=10;
        blackBox.height=9;
        blackBox.breadth=8;
        System.out.println(blackBox.volume());
        Box6 woodenBox=new Box6(1,2,3);
        woodenBox.length=10;
        woodenBox.height=9;
        woodenBox.breadth=8;

        System.out.println(woodenBox.volume());

    }
}
