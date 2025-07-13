package Linked_List;

public class CLL {
    static private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    private Node head;
    private Node tail;
    public CLL(){
        this.head=null;
        this.tail=null;
    }
    public void insert_last (int val){
        Node new_node = new Node(val);
        if (head==null){
            head=new_node;
            tail=new_node;
            return;
        }
        tail.next=new_node;
        new_node.next=head;
        tail=new_node;
    }
    public void display(){
        Node temp = head;
        if (head!=null){
            do{
                System.out.print(temp.val+"-->");
                temp=temp.next;
            }while(temp!=head);
        }
        System.out.println("Head");
    }
    public int length_cycle(){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                Node temp = slow;
                int size =0;
                do {
                    temp=temp.next;
                    size++;
                }while(temp!=slow);
                return size;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert_last(5);
        list.insert_last(6);
        list.insert_last(7);
        list.display();
    }
}
