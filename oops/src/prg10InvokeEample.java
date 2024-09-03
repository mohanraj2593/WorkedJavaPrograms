class Student{
    String name;
    int rollno=20;
    int[] mark=new int[3];
   int marksTotal(){
        int c=0;
        for(int i=0;i<mark.length;i++){
            c=c+mark[i];

        }
        return c;
   }
}




public class prg10InvokeEample
{
    public static void main(String[] args) {//encapsulation
        Student stu = new Student();
        stu.name="Mohanraj";
        stu.rollno=24;
        stu.mark=new int[]{11,22,33,44};
        System.out.println(stu.marksTotal());

    }
}
