package OOP;

public class MethodOverloading {
    static int max(int a,int b){
        return a>b?a:b;
    }
    static double max(double a,double b){
        return a>b?a:b;
    }
    static char max(char a,char b){
        return a>b?a:b;

    }
    public static void main(String[] args) {
        System.out.println(max(0,1));
        System.out.println(max(1.0,2.0));
        System.out.println(max('p','q'));
        System.out.println(Math.abs(-4.5));
        System.out.println(Math.abs(10));
    }
}
