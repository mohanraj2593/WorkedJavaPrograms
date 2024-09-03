package prg16OOP;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Stack {
    int[] s = new int[10];
    private int top;
    Stack(){
        top=-1;
    }
    void push(int item){
        if(top==s.length){

            System.out.println("Stack is Full");

        }
        else {
            s[++top] = item;
        }

    }
    int pop(){
        if(top>=0){
            return s[top--];
        }
        else{
            System.out.println("Stack is Empty");
            return -1;
        }



    }
}
