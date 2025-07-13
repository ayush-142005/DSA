package Linked_List;

public class Meregesort_LL {
    private Node head; // start point
    private Node tail; // end point
    private int size;

    private class Node{
        private int value;
        private Node next; // 'next' points to another Node object

        public Node(int value){
            this.value=value;
            // tail node points to null
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public int insertfirst(int val){
        Node node = new Node(val); // Create a new node
        node.next=head; // the new node will be placed before the current head
        head=node; //
        if (tail==null){ // empty before inserting
            tail=head;
        }
        size++;
        return val;
    }


    public int insertlast(int val){
        if (tail==null){ // Empty
            insertfirst(val);
            return val;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
        return val;
    }


    // Constructor for Linked_List.LL Class
    public Meregesort_LL(){
        this.size=size;
    }

    public void sort (Node arr1 , Node arr2){
        Node temp=head;
        while(arr1.next!=null && arr2.next!=null){
            if (arr1.value<arr2.value){
                insertlast(arr1.value);
                temp=arr1.next;
            }
            else{
                insertlast(arr2.value);
            }
        }
        while(arr1.next!=null){
            insertlast(arr1.value);
            arr1=arr1.next;
        }
        while(arr2.next!=null){
            insertlast(arr2.value);
            arr2=arr2.next;
        }

    }

}
