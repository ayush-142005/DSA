package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Undoredo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = "Ayush";
        char Name_arr[] =Name.toCharArray();
        Stack<Character> st1 =new Stack<>();
        Stack<Character> st2 =new Stack<>();
        for (int i=0;i<Name_arr.length;i++) {
            st1.push(Name_arr[i]);
        }
        System.out.println(st1);
        System.out.println("Enter 0 to Stop");
        int n =sc.nextInt();
        while (n!=0){
            System.out.println("Enter 'U' for Undo, 'R' for Redo, '0' to Stop");
            String alpha = sc.next();
            if (alpha=="0"){
                break;
            }
            if (alpha=="U"){
                st2.push(st1.pop());
            } else if (alpha=="R") {
                st1.push(st2.pop());
            }
            else{
                System.out.println("Nothing");
            }

        }
        System.out.println(st1);
        System.out.println(st2);
    }
}
