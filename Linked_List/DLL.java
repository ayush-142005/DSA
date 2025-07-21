package Linked_List;

public class DLL {
    // Inner static class for Node
    static private class Node {
        int value;
        Node prev;
        Node next;

        // Constructor for a node with just a value
        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        // Constructor for a node with value, previous, and next
        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

    }

    private Node head;
    private Node tail;
    private int size;
    public DLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Inserts a new node at the beginning of the list
    public void insert_first(int val) {
        Node node = new Node(val);
        if (head == null) { // If the list is empty
            head = node;
            tail = node; // Head and tail are the same
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    // Inserts a new node at the end of the list
    public void insert_last(int val) {
        Node node = new Node(val);
        if (tail == null) { // If the list is empty (same as head == null)
            insert_first(val); // Reuse insert_first
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    // If the tail is not given
    public void insert_last_t(int val){
        Node temp = head;
        Node new_node = new Node(val);
        while(temp.next!=null){
            temp=temp.next;
       }
        temp.next=new_node;
        new_node.prev=temp;
        size++;
    }
    // Traverses and prints the list from head to tail (forward)
    public void traversal_f() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    // Insert at the at any indx
    public void insert_mid(int val,int idx){
        Node new_node = new Node(val);
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;
        new_node.prev=temp;
        temp.next.prev=new_node;
        size++;
    }

    // Traverses and prints the list from tail to head (backward)
    public void traversal_b() {
        Node temp = tail; // Start from the tail
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.value + " <-- ");
            temp = temp.prev; // Move backward
        }
        System.out.println("START");
    }

    // Displays the list (similar to traversal_f, good to have a dedicated display)
    public void display() {
        traversal_f(); // Can just call the forward traversal
    }

    // Main method for testing
    public static void main(String[] args) {
        DLL list = new DLL(); // Create an instance of DDL
        list.insert_first(3);
        list.insert_first(2);
        list.insert_first(8);
        list.insert_first(17);

        System.out.println("Forward Traversal:");
        list.traversal_f(); // This will print: 17 --> 8 --> 2 --> 3 --> END

        list.insert_last(99);
        list.insert_last_t(88);
        list.insert_mid(10,3);
        System.out.println("\nForward Traversal after inserting 99 at last:");
        list.traversal_f(); // This will print: 17 --> 8 --> 2 --> 3 --> 99 --> END

        System.out.println("\nBackward Traversal:");
        list.traversal_b(); // This will print: 99 <-- 3 <-- 2 <-- 8 <-- 17 <-- START

        System.out.println("\nDisplay method:");
        list.display(); // Should be same as forward traversal
    }
}