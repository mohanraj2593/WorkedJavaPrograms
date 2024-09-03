class Box4{
    double radious=3.142;
    int r;
    double surfaceAreaCircle(){
        double val=radious*(r*r);

    return val;
    }

}

public class prg9SurafacArea
{
    public static void main(String[] args) {
        Box4 Circle=new Box4();
        Circle.r=10;
        System.out.println(Circle.surfaceAreaCircle());


    }
}
