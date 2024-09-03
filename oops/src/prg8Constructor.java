class Box1{
    int length;//insance variable
    int breadth;
    int height;
    int volume(){
        return length*height*breadth;
    }
    Box1(int l,int b,int h){//Constructor Class Name and Method Name is Same and no return type
        length=l; //Directly passing parameter on Object only
        breadth=b; //Only  initializing variable
        height=h;


    }
    Box1(){
        length=-1;
        height=-1;
        breadth=-1;

    }
    Box1(int l){
        length=height=breadth=l;

    }
    void setDimension(int length,int breadth,int height){
        this.length=length;
       this. breadth=breadth;
       this.height=height;


    }


}





public class prg8Constructor
{
    public static void main(String[] args) {
        Box1 blackBox=new Box1(10,11,10);// brakets used for only constructor parameter passing
        Box1 woodenBox=new Box1(5,5,6);

        woodenBox.setDimension(10,12,11);
        blackBox.setDimension(10,20,30);
        System.out.println("object method set dimension:"+blackBox.volume());

          blackBox.length=10;
        blackBox.breadth=12;
        blackBox.height=13;
        System.out.println("object method instance:"+blackBox.volume());

        System.out.println("not constructor for black Box:"+blackBox.volume());
        System.out.println("not constructor for wooden:"+woodenBox.volume());
        Box1 b1=new Box1();
        System.out.println(b1.volume());
        Box1 c1=new Box1(5);
        System.out.println(c1.volume());



    }
}
