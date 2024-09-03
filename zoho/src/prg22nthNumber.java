import java.util.ArrayList;

public class prg22nthNumber {
    public static void main(String[] args) {
        int a=3;
        int b=7;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(a);
        al.add(b);
        int i=0;
        int index=0;
        int num=0;
        int temp=0;
        int temp1=0;
        int num2=0;

      for(int j=1;j<=100;j++) {
              for (i = 1; i <= 2; i++) {
                  if(al.size()<=100) {

                  if (i == 1) {

                          temp = al.get(index);
                          index = index + 1;
                          num = (temp * 10) + a;
                          al.add(num);
                          if (al.size() <= 100) {

                              num2 = (temp * 10) + b;
                              al.add(num2);
                          }
                      }


                  } else {
                          if(al.size()<=100) {

                          temp1 = al.get(index);
                          index = index + 1;
                          num = (temp1 * 10) + a;
                          al.add(num);

                          num2 = (temp1 * 10) + b;
                          al.add(num2);
                      }


                  }



          }

      }

        System.out.print(al+" ");
        System.out.println(al.size());

    }
}

