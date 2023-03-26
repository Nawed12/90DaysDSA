import java.net.SocketTimeoutException;

public class LL {
    public class Node{
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

    // METHODS
    // add()  remove()  print()  search()

    // ADD First
    public void addFirst(int data){
        // STEP1: create new Node 
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        // 2: Link newNode--> next = head
        newNode.next=head;
        //3: head =newNode
        head=newNode;
    }

    // ADD last 
    public void addLast(int data){
        // 1: create a newNode
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //2: Tail->Next = newNode
        tail.next=newNode;

        // 3: tail =newNode
        tail=newNode;
    }

    // PRINT
    public static void print(){
        if(head==null){
            System.out.println("List is empty ");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // Add in the Middle
    public void addM(int indx,int data){
        if(indx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        // i==indx-1 && temp==prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // Remove first 
    public int removeFirst(){
        if(size==0){
            System.out.println("List is empty ");
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
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev =size-2
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

    // Search(Iterative)
    public static int iterativeSearch(int key){
        Node temp=head;
        int indx=0;
        while(temp!=null){
            if(temp.data==key){
                return indx;
            }
            temp=temp.next;
            indx++;
        }
        // Not found 
        return -1;
    }

    // Recursive Search
    public static int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int indx=helper(head.next, key);
        if(indx==-1){
            return -1;
        }
        return indx+1;
    }
    public static int recursiveSearch(int key){
        return helper(head, key);
    }
    
    // REVERSE a LL ---> 3 variables 4 steps
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        LL ll=new LL();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(3);                                                 
        ll.addM(2, 8);
        ll.print();
        //ll.removeFirst();
        // ll.print(); 

        // ll.removeLast();
        // ll.print();
   
        System.out.println("size: "+ll.size);
         ll.reverse();
         ll.print();
        // ll.reverse();
        // ll.print();


        //  System.out.println(iterativeSearch(3));
        // System.out.println(recursiveSearch(8));
        
        
    }
}
