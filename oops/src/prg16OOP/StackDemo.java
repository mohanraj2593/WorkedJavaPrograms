package prg16OOP;

import java.util.Arrays;

public class StackDemo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(5);
        s1.push(6);
        s1.push(8);
//        s1.s[8]=10;
//        System.out.println(s1.s[8]);
        System.out.println(s1.pop());
        System.out.println(Arrays.toString(s1.s));
    }
}
