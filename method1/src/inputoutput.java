public class inputoutput
{
    public static void main(String args[]){

        add();
        sub();
        mul(1,2);
        int a=div(10);
        System.out.println(a);
    }
    public static void add(){
        System.out.println("Inside Add Method");
    }
    public static int sub(){
        System.out.println("Inside sub Method");
        return 0;
    }
    public static void mul(int a, int b){
        System.out.println("Inside mul method");
    }
    public static int div(int x){
        System.out.println("Inside div method");

        return 20;
    }
}
