package oop;
import java.io.IOException;
public class prg5Throws1{



void principal()throws IOException{
    throw new IOException("Demo");

}

void management() throws IOException {
   principal();
}
void class1() {
        try {
            management();
        } catch (Exception e) {
            System.out.println("Error Occurred " + e);
        }
}






    public static void main(String[] args) {
    prg5Throws1 obj = new prg5Throws1();
    obj.class1();
        System.out.println("Normal Flow");

    }
    }

