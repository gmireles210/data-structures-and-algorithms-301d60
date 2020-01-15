package linkedList;

//Made LinkedList Public so it can be viewed throughout
//Named LL Potatoe to try using a diff variable

public class LinkedList<Potatoe> {

// methods learned from class
    Node<Potatoe> head;
    //refactored old code using same names in order to create Node var
    static int dataVal;

    public LinkedList() {
        this.head = null;
        dataVal = 0;
    }

    public void insertHead(Potatoe value) {

        if (this.head == null) {
            this.head = new Node<>(value);
        } else {
            Node<Potatoe> newNode1 = new Node<>(value);
            newNode1.followOn = this.head;
            this.head = newNode1;
        }
        LinkedList.dataVal++;
    }

    public void append(Potatoe value) {

        if (this.head == null) {
            head = new Node<>(value);
        } else {
            Node<Potatoe> newNode = new Node<>(value);
            Node<Potatoe> curr = this.head;
            while (curr.followOn != null) {
                curr = curr.followOn;
            }

            curr.followOn = newNode;
        }
    }

    public boolean insertBefore(Potatoe value, Potatoe newVal) {

        Node<Potatoe> curr = this.head;

        while (curr.followOn != null) {

            if (curr.followOn.value.equals(value)) {
                Node<Potatoe> newNode = new Node<>(newVal);
                newNode.followOn = curr.followOn;
                curr.followOn = newNode;
                return true;
            }

            curr = curr.followOn;
        }

        return false;
    }

    public boolean insertAfter(Potatoe value, Potatoe newVal) {

        Node<Potatoe> curr = this.head;

        while (curr.followOn != null) {

            if (curr.value.equals(value)) {
                Node<Potatoe> newNode = new Node<>(newVal);
                newNode.followOn = curr.followOn;
                curr.followOn = newNode;
                return true;

            }
            curr = curr.followOn;
        }

        return false;
    }

    public boolean includedInList(Potatoe value) {

        Node<Potatoe> curr = this.head;

        while (curr != null) {
            if (curr.value == value) {
                return true;
            } else {
                curr = curr.followOn;
            }
        }
        return false;
    }

    public int getSize() {
        return dataVal;
    }


    public String toString() {

        StringBuilder listString = new StringBuilder();

        Node<Potatoe> curr = head;

        while (curr != null) {
            listString.append("{ ");
            listString.append(curr.value.toString());

            if (curr.followOn == null) {
                listString.append(" } -> NULL");
            } else {
                listString.append(" } -> ");
            }
            curr = curr.followOn;
        }

        return listString.toString();
    }

    public Potatoe llKthFromEnd(int K) {

        int mark = this.getSize() - K - 1;
        if (mark < 0) {
            throw new ArrayIndexOutOfBoundsException("Requested mark cannot be found!");
        }

        Node<Potatoe> curr = head;
        while (mark > 0) {
            curr = curr.followOn;
            mark--;
        }
        return curr.value;
    }

    public static class Node<Potatoe2> {

        public Potatoe2 value;
        public Node<Potatoe2> followOn;

        public Node(Potatoe2 value) {
            this.value = value;
            this.followOn = null;
        }
    }
}
