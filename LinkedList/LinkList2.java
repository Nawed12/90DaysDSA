public class LinkList2 {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Print
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + "-->");
        }
        System.out.println();
    }

    // Search (Iterative)
    public int search(int key) {
        int i = 0;
        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.data == key) {
                return i;
            }
            i++;
        }
        // Not found
        return -1;
    }

    // REVERSE
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find and Remove Nth Node from the end
    public void deleteEnd(int n) {
        // Calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (sz == n) {
            head = head.next;
            return;
        }
        // size-n
        int i = 1;
        int itoFind = sz - n;
        Node prev = head;
        while (i < itoFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    // CHECK IF LINKED LIST IS PALINDROME OR NOT

    // helper function to find midNode
    public Node mid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
           slow=slow.next;   //+1
           fast=fast.next.next;  //+2
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // step1: Find midNode
        Node midNode=mid(head);
        // Step2: reverse 2nd Half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        // step3: check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkList2 l = new LinkList2();
        l.add(1);
        l.add(2);
        l.add(1);
        l.print();
        // System.out.println(l.search(3 ));
        // l.reverse();
        // l.deleteEnd(2);
        System.out.println(l.checkPalindrome());
        l.print();
    }
}
