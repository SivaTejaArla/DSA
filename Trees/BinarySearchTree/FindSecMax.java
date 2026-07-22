import java.util.ArrayList;

public class FindSecMax {

    static Node root;

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    // Method to insert a value into the Binary Search Tree
    static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // In-order traversal method to populate the ArrayList with tree values
    static void inOrder(Node root, ArrayList<Integer> a) {
        if (root == null) return;

        // Traverse left subtree
        inOrder(root.left, a);

        // Visit root and add its value to the ArrayList
        a.add(root.data);

        // Traverse right subtree
        inOrder(root.right, a);
    }

    // Method to find the second largest element
    static int findSecLar(Node root) {
        ArrayList<Integer> a = new ArrayList<>();
        inOrder(root, a); // Fill ArrayList with in-order traversal

        // Check if the list has at least two elements
        if (a.size() < 2) {
            throw new IllegalArgumentException("Tree must have at least two nodes to find the second largest element.");
        }

        // Return the second largest element (second to last in the sorted list)
        return a.get(a.size() - 2);
    }

    public static void main(String[] args) {

        // Insert nodes into the tree
        root = insert(root, 9);
        root = insert(root, 6);
        root = insert(root, 3);
        root = insert(root, 29);
        root = insert(root, 13);

        // Find the second largest element and print it
        try {
            int secMax = findSecLar(root);
            System.out.println("Second Largest Num is : " + secMax);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
