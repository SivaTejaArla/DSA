package BinarySearchTree;

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
static boolean searchKey(Node root , int key ){

    if (root == null ){
        return false;
    }

    if(root.data< key){
        return searchKey(root.right, key);
    }
    else if( root.data == key){
        return true;
    }else{
         return searchKey(root.left, key);
    }
}
    public static void main(String args[]) {


        boolean isFound= false;

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
        isFound = searchKey(root, 6);

        if (isFound) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key Not Found");
        }
        

    }
}