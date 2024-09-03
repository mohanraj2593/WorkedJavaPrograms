package OOP3;
import java.lang.reflect.*;

public class prg32JavaReflection
{
    public static void main(String[] args) {
        Employee e = new Employee("divya",60000);
        Class cls = e.getClass();
        System.out.println(cls.getName());
        Method[] methods = cls.getMethods();
        for(Method m:methods){
            System.out.println(m.getName());
        }
//        System.out.println(methods[1].invoke(e,null));


    }
}
