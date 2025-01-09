import java.util.*;

public class RemoveDup {

    static Node head;

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    static void insert(int val) {

        Node newNode = new Node(val);
        if (head == null) {

            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {

            curr = curr.next;
        }
        curr.next = newNode;
    }

    static void display(Node head) {

        Node curr = head;
        System.out.println(" Nodes : ");
        while (curr != null) {
            System.out.print(curr.data + "\t");
            curr = curr.next;
            ;
        }
        System.out.println();
    }

    static void deleteDup() {

        Node curr = head;

        while (curr != null) {
            Node runner = curr.next;
            Node prev = curr;

            while (runner != null) {
                if (curr.data == runner.data) {
                    prev.next = runner.next; // Skip the duplicate node by linking 'prev' to 'runner.next'
                } else {
                    prev = runner; // If no duplicate, move 'prev' forward to the 'runner' node
                }

                runner = runner.next;
            }

            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the number of  nodes : ");
        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int x : a) {
            insert(x);
        }
        display(head);
        deleteDup();
        display(head);

    }
}