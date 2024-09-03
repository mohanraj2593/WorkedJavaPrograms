package OOP1;

import OOP.Stack;

import java.util.Arrays;

public class StackChar {
    public static void main(String[] args) {
        Stack1 s2=new Stack1();
        s2.push('a');
        s2.push('b');
        s2.push('c');
        s2.push('d');
        System.out.println( s2.pop());
        System.out.println(Arrays.toString(s2.a));
    }
}
