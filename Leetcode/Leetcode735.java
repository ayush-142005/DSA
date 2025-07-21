package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode735 {
    public static void main(String[] args) {
        int [] asteroids = {-2,-1,1,2};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
    static int[] asteroidCollision(int[] asteroids){
        Stack <Integer> stack1 =new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int curr_p=asteroids[i];
            if (curr_p>0){
                stack1.push(curr_p);
            }
            else {
                while(!stack1.isEmpty() && stack1.peek()>0){
                    if(stack1.peek()< -1*curr_p){
                        stack1.pop();
                        continue;
                    } else if (stack1.peek()== -1*curr_p) {
                        stack1.pop();
                        curr_p=0;
                        break;
                    }else {
                    curr_p=0;
                    break;
                    }
                }
                if (curr_p!=0){
                    stack1.push(curr_p);
                }
            }
        }
        Integer [] tempArray = stack1.toArray(new Integer[0]);
        int[] intArray = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            intArray[i] = tempArray[i];
        }
        return intArray;

    }
}
