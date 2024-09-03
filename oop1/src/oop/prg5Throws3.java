package oop;

import java.io.IOException;

class school{
    void method1() throws IOException {
        System.out.println("School Running");
    }
}

public class prg5Throws3 {
    public static void main(String[] args) throws IOException {
        school s = new school();
        s.method1();
        System.out.println("Normal Flow");

    }
}
