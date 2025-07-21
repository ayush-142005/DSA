package Linked_List;

// Custom Linked List
public class LL {
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
    // Constructor for Linked_List.LL Class
    public LL(){
        this.size=size;
    }

    // Display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" --> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

//    public void dispaly_rec(){
//        Node temp = head;
//        if (temp==null){
//            return;
//        }
//        System.out.print(temp.value + "-->");
//        dispaly_rec(temp.next);
//    }
//// reverse
//    public void display_reverse(){
//        Node temp = head;
//        if (temp == null){
//            return;
//        }
//        display_reverse(temp.next);
//        System.out.println(temp.value +"-->");
//
//    }
// length
    public int length(){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    // Insert at a particular Index
    public void insert_up(int val,int index){
        Node new_node = new Node(val);
        Node temp = head;
        if (index==0){
            insertfirst(val);
        }
        if (index==size){
            insertlast(val);
        }
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next= new_node;
        size++;
    }

    // insert at last
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

    // insert at First
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

    // Delete at first
    public int deletefirst(){
        int val =head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }

    // Update Value
    public void update(int val1,int index){
        if (index<0){
            System.out.println("There is no Position ");
        }
//        if (index==size-1){
//            return insertlast(val1);
//        }
//        if (index==0){
//            return insertfirst(val1);
//        }
        Node temp = head;
        int count =0;
        if (count==index){
            temp=temp.next;
            int old_val = temp.value;
        }
        Node temp1=head;
        while(temp!=null){
            System.out.print(temp1.value+" --> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    // Get / checking the node is present or not
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }


    // delete at last
    public int delete_last(){
        if (size<=1){
            return deletefirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail=secondlast;
        tail.next=null;
        return val;
    }

    // Delete in Index
    public int delete_index(int index){
        if (index==0){
            return deletefirst();
        }
        if (index==size-1){
            return delete_last();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;

    }

    // Deleting Particular value
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    // Occurance
    public void occurance(int target) {
        Node temp = head;
        if (head == null) {
            return;
        }
        if (head.value == target) {
            head = head.next;
        }
        while (temp != null) {
            if (temp.value == target) {
                temp.next = temp.next.next;

            }
            temp = temp.next;

        }
        return;
    }
    // mid of linked list
    public int mid (){
        if (head==null){
            return -1;
        }
        Node two_x=head;
        Node one_x=head;
        while(two_x.next!=null && one_x.next!=null){
            two_x=two_x.next.next;
            one_x=one_x.next;
        }
        return one_x.value;
    }

    // insert using recusion
    void insert_recursion(int value , int idx){
        Node node = null;
        head=insert_recursion(value,idx,node);

    }
    private Node insert_recursion(int value,int idx,Node node){
        if (idx ==0){
            Node temp=new Node(value,node);
            size++;
            return temp;
        }
        node.next=insert_recursion(value,idx-1,node.next);
        return node;
    }
    public void duplicates(){
        Node temp = head;
        while(temp.next!=null){
            if (temp.value == temp.next.value){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;
            }
        }
        tail= temp;
        tail.next=null;
    }
    public static LL merge(LL first , LL second){
        Node head1=first.head;
        Node head2 = second.head;
        LL new_list = new LL();
        while(head1!=null && head2!=null){
            if (head1.value<head2.value){
                new_list.insertlast(head1.value);
                head1=head1.next;
            }
            else{
                new_list.insertlast(head2.value);
                head2=head2.next;
            }
        }
        while(head1!=null){
            new_list.insertlast(head1.value);
            head1=head1.next;
        }
        while(head2!=null){
            new_list.insertlast(head2.value);
            head2=head2.next;
        }
        return new_list;
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.insertlast(1);
        list.insertlast(2);
        list.insertlast(2);
        list.duplicates();
        list.display();
    }
}
