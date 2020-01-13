package linkedList;

public class LinkedList {
    // makes Node head seen to entire file
    Node head;
    // Node pointer to the next
    class Node {
        int dataVal;
        Node next;
        Node(int dataVal, Node next) {
            this.dataVal = dataVal;
            this.next = next;
        }
    }
    // Head
    public void insertHead(int headValue){
        // New Head instantiation
        Node NodeHead = new Node(headValue, null);
        // Retain old list data
        Node FormerHead = this.head;
        // Create new head
        this.head = NodeHead;
        // Assign new head's "next" to old list data
        this.head.next = FormerHead;
    }
    // Include List with dataVal
    public boolean includedInList(int searchValue){
        // Creating current instance
        Node curr = this.head;
        while (curr != null){
            if (searchValue == curr.dataVal){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    // Create string with dataVal
    public String toString(){
        Node curr = this.head;
        String overallCommand = "";
        while (curr != null){
            String stringCommand = "{ " + curr.dataVal + " } => ";
            overallCommand = overallCommand + stringCommand;
            curr = curr.next;
        }
        return overallCommand + "null";
    }
}
