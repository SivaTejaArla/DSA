package Binarytree;

import java.util.Stack;

public class Binarytree {


    private static Node root;
     private class Node{

        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data=data;
        }
     }
void createTree(){

Node first =new Node(1);
Node second = new Node(2);
Node third = new Node(3);
Node fourth = new Node(4);
Node fifth = new Node(5);
root=first;
first.left=second;
first.right=third;
second.left=fourth;
second.right=fifth;
}
void preOrderRecursion(Node root){

    if(root==null){
        return;
    }
    System.out.print(root.data+ " ");
    preOrderRecursion(root.left);
    preOrderRecursion(root.right);
}

void preOrderIteration(Node root){

    if(root == null){
        return;
    }
    Stack <Node> stack=new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()){

        Node temp = stack.pop();
        System.out.print(temp.data + " ");
        if(temp.right!=null){
            stack.push(temp.right);
        }
        if(temp.left!=null)
        stack.push(temp.left);
    }

}
    public static void main(String[] args) {
        Binarytree b=new Binarytree();
        b.createTree();
        b.preOrderRecursion(root);
        System.out.println();
        b.preOrderIteration(root);
    }
}
