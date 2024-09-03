public class prg3Method1 {
    //method inputs-arguments or parameter int a=10; a is parameter and 10 value is arguments
    //int-return type and main method store variable and print variable
    //void without return type(data type Not Mentioned)
    //Non-Static to static call using only object creation method
    //static - is act as PSVM Method without Using object to call the method using variable
    static int boxVolume(int length,int breadth,int height){ //method definition
        int vol;
        vol=length*breadth*height;
        return vol;


    }
    void printLine(){
        System.out.println("----------");
    }
    public static void main(String[] args) {
        prg3Method1 a=new prg3Method1();
        a.printLine();
        System.out.println("Hello");
        System.out.println("Mohanraj"); //Method call
        System.out.println(boxVolume(10,4,6)); //Method call //Argument Pass
        a.printLine();

    }
}
