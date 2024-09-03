package OOP1;

public class Stack1 {
    char[] a=new char[10];
    int top;
    Stack1(){
        top=-1;

    }
    void push(char item){
        if(top==9){
            System.out.println("Stack Char is Full");
        }
        else {
            a[++top] = item;
        }

    }
    int pop(){
        if(top>=0){
            return a[top--];


        }
        else {
            System.out.println("Stack is Empty");
            return -1;
        }

    }
}
