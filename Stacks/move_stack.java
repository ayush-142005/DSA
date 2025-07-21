package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class move_stack {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Stack<String> st =new Stack<>();
        int n;
        System.out.println("Enter the size of the stack");
        n=sc.nextInt();
        System.out.println("Enter the number :");
        for (int i = 0; i < n; i++) {
            String x= sc.next();
            st.push(x);
        }
        System.out.println(st);

        while(st.size()>0){
            name.add(st.pop());
        }
        System.out.println(String.join("", name));
    }
}
