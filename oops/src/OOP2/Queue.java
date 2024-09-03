package OOP2;

public class Queue {
    int[] arr=new int[10];
    int top;
    int start=0;
    Queue(){
        top=-1;
    }
    void push(int item){
        if(top==9){
            System.out.println("Queue is Full");

        }
        else{
            arr[++top]=item;
        }
    }
    int pop(){
        if(top>=0){
            return arr[start++];

        }
        else{
            System.out.println("Queue is Empty");
            return -1;
        }

    }
}
