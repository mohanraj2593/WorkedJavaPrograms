import java.util.Arrays;
import java.util.Collections;


public class Sorting_Arrays {
    public void sort_ascending_order()
    {
        String[] str = {"Apple","Banana","Car"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

    }
    public void sort_descending_order()
    {
        String[] str={"Apple","Bannana","Car"};
        Arrays.sort(str,Collections.reverseOrder());
        System.out.println(Arrays.toString(str));
    }

    public static void main(String[] args) {
        Sorting_Arrays SA=new Sorting_Arrays();
        SA.sort_ascending_order();
        SA.sort_descending_order();
    }

}
