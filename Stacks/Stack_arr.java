package Stacks;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Stack_arr {

    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
        // push
//        Stack<String> st = new Stack<>(); // LIFO
//        System.out.println(st);
//        st.push("A");
//        st.push("Y");
//        st.push("U");
//        st.push("S");
//        st.push("H");
//        //peek
//        System.out.println(st.peek());
//        System.out.println(st);
//        System.out.println(st.pop());
//        System.out.println("Size is "+st.size());
//
//        while(st.size()>1){
//            System.out.println( st.pop()); // first element
//        }
//        System.out.println(st);
//        while(st.size()>0){
//            System.out.println( st.pop());// first element
//        }
//        System.out.println(st.isEmpty());

//        Stack <String> st= new Stack<>();
//        List<String> Name= new ArrayList<>();
//        st.add("A");
//        st.add("Y");
//        st.add("U");
//        st.add("S");
//        st.add("H");
//        while(st.size()>0){
//           Name.add(st.pop());
//        }
//        String listString = String.join("", Name);
//        System.out.println(listString);

        Stack<Integer> s1 = new Stack<>();
        s1.push(34);
        s1.push(35);
        s1.push(37);
        s1.push(38);
        s1.push(40);
        System.out.println(s1.pop());
        System.out.println(s1.peek());
    }
}
