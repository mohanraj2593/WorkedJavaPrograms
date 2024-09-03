package OOP2;

public class QueueDem {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Queue q = new Queue();
        q.push(10);
        q.push(11);
        q.push(8);
        System.out.println(q.pop());
        System.out.println(q.pop());
    }

}
