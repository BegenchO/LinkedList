public class Main {
     public static void main(String args[]) {
        LinkedList myList = new LinkedList();
        
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(20);
        
        myList.displayAll();
        myList.reverseList();
        System.out.println();
        myList.displayAll();
     }
}
