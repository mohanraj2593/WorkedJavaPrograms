package oop;

import java.io.IOException;

class school1{
    void method1()throws IOException {
        throw new IOException("demo");

    }
}

public class prg5Throws31 {
    public static void main(String[] args) throws IOException{
        school1 s = new school1();
        s.method1();
        System.out.println("Normal Flow");

    }
}
