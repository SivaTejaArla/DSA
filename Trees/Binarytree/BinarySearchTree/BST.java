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


    public static  void inOrder(Node root){

        if(root == null ){
            return ;
        }

        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);


    }
    public static void main(String args[]) {


        int[] a = { 3, 6, 8, 4, 99, 42 };

        for (int x : a) {
         root = insert(root, x);
        }
        System.out.println("Inserted");

        inOrder(root);



    }
}