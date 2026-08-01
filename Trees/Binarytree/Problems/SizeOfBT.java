package Binarytree.Problems;

/*

        1
       / \
      2   3
     /   / \
    4   6   5


Size = total no.of Nodes 



Approach:

 We can use any traversal andd use a count variable at each node 
*/


public class SizeOfBT {


static int count = 0;
    static class Node{
        int data; 
        Node left;
        Node right;

        Node(int x ){
            data = x ;
        }
    }

static void findSize(Node  root){
   if(root == null) return;
   count++;
   findSize(root.left);
   findSize(root.right);
}



    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5); 
        Node e = new Node(6);
        root.left = a;
        root.right = b;

        a.left = c; 
        b.right = d;
        b.left = e;

        findSize(root);
        System.out.println(count);

    }

}
