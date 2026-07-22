package Stack;

public class Stacklist {
    

    private Node top;
    private int length =0;
private class Node{

    private int data;
    private Node next;
    public Node (int data){
        this.data=data;
    }
}
 
void push(int data){
    Node newNode=new Node(data);
    newNode.next=top;
    top=newNode;
    length++;
}
void pop(){
    if(length == 0){
        System.out.println("Empty stack");
    }
    int result =top.data;
    top=top.next;
    length--;
    System.out.println("Popped : "+result);
}

    public static void main(String args[]){
Stacklist l=new Stacklist();
l.push(5);
l.pop();
    }
}
