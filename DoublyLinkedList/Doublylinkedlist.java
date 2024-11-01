package DoublyLinkedList;

public class Doublylinkedlist {
    Node head;
    Node tail;

    private class Node {

        Node prev;
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            tail = newNode;
        }
        head = tail;
        tail.next = null;
        tail.prev = null;
    }

    void printNodes() {

        if (head == null) {
            System.out.println("Emptyt List");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }

        }
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("Empty List");
        }
        Node temp = head;
        if (head == tail) {
            tail = null;
        }

        else {
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("Empty List");
        }
        Node temp = tail;
        if (head == tail) {
            head = null;
        }

        else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        temp.prev = null;
    }

    public static void main(String args[]) {

        Doublylinkedlist l = new Doublylinkedlist();
        l.insert(5);
        l.insertAtBeginning(7);
        l.insertAtBeginning(6);
        l.insertAtEnd(8);
        l.insertAtEnd(9);
        l.deleteLast();
        l.printNodes();

    }
}
