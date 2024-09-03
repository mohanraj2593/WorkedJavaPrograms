class Box8{
    int length;
    int height;
    int breadth;
    Box8(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;

    }
   Box8 doubleBox(){ //Returning Object
        Box8 temp=new Box8(2*length,2*breadth,2*height);
        return temp;

   }

}


public class prg16ReturningObject
{
    public static void main(String[] args) {
        Box8 b1=new Box8(3,4,5);
        Box8 b2=new Box8(5,3,4);
        Box8 b3=b1.doubleBox();
        System.out.println(b2.length);
        System.out.println(b3.length);


    }
}
