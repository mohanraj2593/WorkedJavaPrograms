import java.util.ArrayList;

public class prg7 {
    public static void main(String[] args) {
        int a=3;
        int b=7;
        ArrayList<Integer> al = new ArrayList<>();

        int index=0;
        int temp;
        int no1=0;
        int no2=0;
        al.add(a);
        al.add(b);
        for(int j=1;j<=100;j++) {
            if(al.size()<=100)
                {
                    for (int i = 1; i <= 2; i++) {
                        if (i == 1) {
                            temp = al.get(index);
                            index = index + 1;
                            no1 = (temp * 10) + a;
                            al.add(no1);
                            no2 = (temp * 10) + b;
                            al.add(no2);
                        } else {
                            int temp1 = al.get(index);
                            index = index + 1;
                            no1 = (temp1 * 10) + a;
                            al.add(no1);
                            no2 = (temp1 * 10) + b;
                            al.add(no2);
                        }

                    }

                }
            }

        System.out.println(al.get(10));
        System.out.print(al+" ");
        System.out.println(al.size());

    }
}
