package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_b {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        System.out.println(q1.peek());
        System.out.println(q1.remove());
        Deque<Integer> Deque = new ArrayDeque<>();
        Deque.add(69);
        Deque.addFirst(23);
        Deque.addLast(56);

    }
}
