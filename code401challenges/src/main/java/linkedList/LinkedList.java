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
            Node<Potatoe> curr3 = this.head;
            while (curr3.followOn != null) {
                curr3 = curr3.followOn;
            }

            curr3.followOn = newNode;
        }
    }

    public boolean insertBefore(Potatoe value, Potatoe newVal) {

        Node<Potatoe> curr1 = this.head;

        while (curr1.followOn != null) {

            if (curr1.followOn.value.equals(value)) {
                Node<Potatoe> newNode = new Node<>(newVal);
                newNode.followOn = curr1.followOn;
                curr1.followOn = newNode;
                return true;
            }

            curr1 = curr1.followOn;
        }

        return false;
    }

    public boolean insertAfter(Potatoe value, Potatoe newVal) {

        Node<Potatoe> curr2 = this.head;

        while (curr2.followOn != null) {

            if (curr2.value.equals(value)) {
                Node<Potatoe> newNode = new Node<>(newVal);
                newNode.followOn = curr2.followOn;
                curr2.followOn = newNode;
                return true;

            }
            curr2 = curr2.followOn;
        }

        return false;
    }

    public boolean includedInList(Potatoe value) {

        Node<Potatoe> curr4 = this.head;

        while (curr4 != null) {
            if (curr4.value == value) {
                return true;
            } else {
                curr4 = curr4.followOn;
            }
        }
        return false;
    }

    public int getSize() {
        return dataVal;
    }


    public String toString() {

        StringBuilder listString = new StringBuilder();

        Node<Potatoe> curr5 = head;

        while (curr5 != null) {
            listString.append("{ ");
            listString.append(curr5.value.toString());

            if (curr5.followOn == null) {
                listString.append(" } -> NULL");
            } else {
                listString.append(" } -> ");
            }
            curr5 = curr5.followOn;
        }

        return listString.toString();
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
