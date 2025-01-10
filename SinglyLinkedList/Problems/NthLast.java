import java.util.Scanner;

public class NthLast {

    static Node head;

    static int count = 0;

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
            count++;
            curr = curr.next;

        }
        System.out.println();
    }

    static int getNode(int k) {

        int pos = count - k;
        Node curr = head;

        int itr = 1;

        while (itr <= pos) {
            curr = curr.next;
            itr++;
        }

        return curr.data;

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
        System.out.println(" Enter the value of n from last node:  ");
        int k = s.nextInt();

        int res = getNode(k);

        System.out.println("The  " + k + " th node is : " + res);

    }
}
