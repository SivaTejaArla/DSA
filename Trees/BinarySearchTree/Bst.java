
import java.util.*;

public class Bst {

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

    static int findHeight(Node root) {
        if (root == null)
            return -1;

        int l = findHeight(root.left); // left height
        int r = findHeight(root.right); // right height

        return 1 + Math.max(l, r); // 1 is include to add root also
    }

    static boolean searchKey(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data < key) {
            return searchKey(root.right, key);
        } else if (root.data == key) {
            return true;
        } else {
            return searchKey(root.left, key);
        }
    }

    public static void postOrder(Node root) {

        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static void preOrder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        postOrder(root.left);
        postOrder(root.right);

    }

    static Node deleteNode(Node root, int val) {

        /*
         * There will be 3 cases
         * *** case 1 : No Child ------------return 'null ' to parent
         * *** case 2 : One Child ----------------replace with child node
         * *** case 3 : Two children : ---------------replace with inOrder successer
         * (left most node in right subtree)
         * 
         * 
         */

        // Search

        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else {
            // root.data == val

            // case 1

            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3

            Node ins = inOrderSuccessor(root.right);

            root.data = ins.data;

            root.right = deleteNode(root.right, ins.data);

        }
        return root;

    }

    static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String args[]) {

        boolean isFound = false;

        Scanner s = new Scanner(System.in);

        int[] a = { 3, 7, 5, 6, 9, 31, 1, 2 };
        for (int x : a) {
            root = insert(root, x);
        }
        inOrder(root);
        System.out.println();
        isFound = searchKey(root, 6);

        if (isFound) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key Not Found");
        }
        deleteNode(root, 7);
        inOrder(root);
        System.out.println();
        System.out.println("Preorder : ");
        preOrder(root);
        System.out.println();
        System.out.println("Post Order : ");
        postOrder(root);
        System.out.println();

        System.out.println("Height of the tree is : " + findHeight(root));

    }
}