public class MetodOverloading
{
    public static void main(String[] args) {

`
        add();

    }
    public static void add(){
        System.out.println("Number of Arguments");
    }
    public static void add(int a){
        System.out.println("Type of Arguments");

    }
    public static void add(int a,int b){
        System.out.println("Order of Argument1");
    }
    public static void add(int a,float b){
        System.out.println("Int and Float");
    }
    public static void add(float a,int b){
        System.out.println("Float and Integer");
    }
}
