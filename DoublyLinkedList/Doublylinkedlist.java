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
    void display() {
        int count = 0;

        if (head == null) {
            System.out.println("Emptyt List");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data+ " -> ");
                current = current.next;
                count++;
            }

        }
        System.out.println("\nTotal no of nodes are : "+ count);
    }




    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if(head == null){
        head = newNode;
        tail = newNode;
    }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
       
    }
    public void insertPos(int data,int p){
        Node newNode =new Node(data);
        Node c = head;
        int count = 0;
        while(c!=null){
            c=c.next;
            count++;
        }
        if(p==1)
        insertAtBeginning(data);
        else if(p == count + 1)
        insertEnd(data);
        else{
            Node a = head;
            int cn = 1;
            while(cn< p-1){
                a =a.next;
                cn = cn+1;
            }
            Node f = a.next;
            newNode.prev = a;
            a.next = newNode;
            f.prev = newNode;
            newNode.next = f;
        }

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
            head = head.next;
            temp.next = null;
        }
       
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
        l.insertAtBeginning(4);
        l.display();
        
        l.insertAtBeginning(8);
        l.display();
        l.insertPos(6,3);
        l.display();
        l.deleteLast();
        l.display();
       


    }
}
