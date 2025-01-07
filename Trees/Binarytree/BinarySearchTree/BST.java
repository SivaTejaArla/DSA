import java.util.*;

class BST {

    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node insert(Node root, int val) {

        if (root == null) {

            root = new Node(val);
            return root;
        }

        if (root.data > val) {

            // left subtree

            root.left = insert(root.left, val);
        } else {

            // right subtree

            root.right = insert(root.right, val);

        }

        return root;
    }

    public static void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 'n' calue : ");
        int n = s.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();

        }

        for (int x : a) {
            root = insert(root, x);
        }
        System.out.println("Inserted");

        inOrder(root);

    }
}