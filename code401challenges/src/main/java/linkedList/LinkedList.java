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
    // Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
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
    // Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node's value somewhere within the list.
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
    // Define a method called toString which takes in no arguments and returns a string representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"
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
