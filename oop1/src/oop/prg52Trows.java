package oop;
import java.io.*;
class M{
    void method1() throws IOException{
        throw new IOException("Drive Error");
    }
}

public class prg52Trows {
    public static void main(String[] args)  {
        try {
            M m = new M();
            m.method1();
        }catch (IOException e){
            System.out.println("Excepiton Handled "+e);
        }
        System.out.println("Normal Flow");

    }
}
