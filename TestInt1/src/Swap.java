public class Swap
{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("before Swapping"+a+" "+b);
            a=a+b;
            b=a-b;
            a=a-b;
        System.out.println("After Swapping"+a+" "+b);
    }
}
