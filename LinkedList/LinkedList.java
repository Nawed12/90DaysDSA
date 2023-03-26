public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        } 
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // Methods --> Add() , Remove(), Print() , search()

    // Add (first Node)
    public void addFirst(int data){
        // Create New Node 
        Node newNode=new Node(data);
        size++;
        // If no element is present
        if(head==null){
            head=tail=newNode;
            return;
        }
        // NewNode next = head
        newNode.next=head;
        // Head = newNode 
        head=newNode;
    }

    // Add (last Node)
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode=tail;
    }

    // Print a LL
    public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    // ADD  in middle
    public void addMiddle(int idx,int data){
       Node newNode=new Node(data);
       size++;
    //    first Index
    if(idx==0){
         addFirst(data);
         return;
    }
       Node temp=head;
       int i=0;
       while(i<idx-1){
        temp=temp.next;
        i++;
       }
       newNode.next=temp.next;
       temp.next=newNode;
    }

    // Remove First
    public int removeFirst(){
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    // Remove last 
    public int removeLast(){
        if(size==0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        ll.addMiddle(1, 4);
        ll.print();
        System.out.println(ll.size);
        // System.out.println(ll.removeFirst());
        // ll.print();
        System.out.println(ll.removeLast());
        ll.print();
    }
}
