package OOP3;
enum level{
    BEGINNER("B"),INTERMEDIATE("I"),ADVANCED("A");
    private String abbr;
    level(String ab){
        abbr=ab;

    }
    String getAbbr(){
        return abbr;
    }
}

public class prg33EnumDemo {
    public static void main(String[] args) {
        level l1 = level.ADVANCED;
        System.out.println(l1);
        System.out.println(l1.getAbbr());


    }
}
