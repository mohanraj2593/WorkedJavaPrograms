package OOP;

import java.util.Arrays;

public class StackDemo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(5);
        s1.push(6);
        s1.push(8);
        System.out.println(s1.pop());
        System.out.println(Arrays.toString(s1.s));

    }
}
