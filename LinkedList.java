public class LinkedList {
    int size;
    Node head;
    
    LinkedList() {
        head = null;
    }
    
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = null;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            current.next.next = null;
        }
        size++;
    }
    
     int displayAll() {
         if (head == null) {
             return 0;
         }
         Node current = head;
         while (current != null) {
             System.out.print(current.data + " ");
             current = current.next;
         }
         return size;
     }
     
     void reverseList() {
         Node current = head;
         Node next = null;
         Node previous = null;
         
         while(current != null) {
             next = current.next;
             current.next = previous;
             previous = current;
             current = next;
         }
         head = previous;
         
     } 
}
