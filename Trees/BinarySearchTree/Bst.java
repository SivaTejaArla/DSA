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

static void insertWithVoid(int data){
        Node newNode = new Node(data);
        if(root == null ) {
            root = newNode;
            return;
        }
        Node current = root;
       while(true){
           
           if(data < current.data){
               if(current.left == null) {
                   current.left = newNode;
                   break;
               }
               current = current.left;
           }else{
               if(current.right == null) {
                   current.right = newNode;
                   break;
               }
               current = current.right;
           }
       }
       
       System.out.println("Inserted");
        
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

     public static void preorder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void postOrder(Node root) {

        if (root == null) {
            return;
        }
       
        postOrder(root.left);
        postOrder(root.right);
         System.out.print(root.data + " ");

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

    static int findMin(Node root) {

        if (root == null)
            return Integer.MIN_VALUE;
        if (root.left == null) {
            return root.data;
        }

        return findMin(root.left);

    }

    static int findMax(Node root) {

        if (root == null)
            return Integer.MAX_VALUE;

        if (root.right == null) {
            return root.data;
        }

        return findMax(root.right);

    }

    public static void main(String args[]) {

        boolean isFound = false;

        Scanner s = new Scanner(System.in);

        int[] a = { 3, 7, 5, 6, 9, 31, 11, 2, 44 };
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
        System.out.println("Min value in the tree is : " + findMin(root));
        System.out.println("Max value in the tree is : " + findMax(root));

    }
}
