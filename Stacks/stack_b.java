package Stacks;

import java.util.*;
public class stack_b {
    protected int [] arr;
    private static final int DEFAULT_SIZE = 10;
    int ptr =-1;

    // Default Constructor which has a DEFAULT_SIZE for arr
    public stack_b(){
        this(DEFAULT_SIZE);
    }

    // Constructor where the user can add size
    public stack_b(int size){
        this.arr=new int [size];
    }
    // arr is full or not
    public boolean isFull(){
        return ptr == arr.length-1;
    }

    // is Empty
    public boolean isEmpty(){
        return ptr==-1;
    }

    // Push of element using pointer
    public boolean push(int val){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        arr[ptr]=val;
        return true;
    }

    // Pop
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Arr is Empty");
        }
        int removed = arr[ptr];
        ptr--;
        return removed;
    }

    //peek
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannt Peek arr is empty");
        }
        return arr[ptr];
    }

    public static void main(String[] args) throws Exception {
        stack_b s1= new stack_b();
        s1.push(12);
        s1.push(23);
        s1.pop();
        s1.pop();
        s1.pop();


    }
}