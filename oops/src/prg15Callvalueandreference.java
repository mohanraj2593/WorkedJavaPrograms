class Car{
    String name;
    float mileage;
    int cost;
}
public class prg15Callvalueandreference {

    public static void main(String[] args) {
        int a1=1000;
        System.out.println(a1);
        int b1;
        b1=a1;
        System.out.println(b1);
        b1=2000;
        System.out.println(b1);
        System.out.println(a1);



        Car a=new Car();
        a.name="BMW";
        a.mileage=5.5f;
        a.cost=75;
        System.out.println(a.name);
        System.out.println(a.mileage);
        System.out.println(a.cost);
        Car b;
        b=a;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);
        b.name="TATA";
        b.mileage=15.8f;
        b.cost=13;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);

        System.out.println(a.name);
        System.out.println(a.mileage);
        System.out.println(a.cost);


    }
}
