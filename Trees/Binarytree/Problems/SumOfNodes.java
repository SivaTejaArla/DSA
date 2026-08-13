package Binarytree.Problems;
/*

        1
       / \
      2   3
     /   / \
    4   6   5


Size = total no.of Nodes 



Approach:

 We can use any traversal andd use a sum variable at each node 
*/
public class SumOfNodes {


static int sum = 0;
    static class Node{
        int data; 
        Node left;
        Node right;

        Node(int x ){
            data = x ;
        }
    }

static void findSum(Node  root){
   if(root == null) return;
   sum+=root.data;
   findSum(root.left);
   findSum(root.right);
}

// Using recursion 

static int findSumRecursion(Node  root){
   if(root == null) return 0;

   return root.data+findSumRecursion(root.left)+findSumRecursion(root.right);

  
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

        findSum(root);
        System.out.println(sum);
 System.out.println("Using Recursion : "+findSumRecursion(root));
    }

}
