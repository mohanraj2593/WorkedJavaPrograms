package OOP3;

public class prg34JavaWrapperDemo {
    public static void main(String[] args) {
        int i=10;
        float f=10f;
        Integer i2 = Integer.valueOf(i);//Boxing,Wrapping
        int j=i2;//unboxing
        Integer i3=20;//autoboxing
        int k=i2;//autounboxing
        String s="123";
        int i4=Integer.parseInt(s);
        System.out.println(i4);
        System.out.println();
        System.out.println(k);
        System.out.println(i3);
        System.out.println(j);
        System.out.println(i2);

    }
}
