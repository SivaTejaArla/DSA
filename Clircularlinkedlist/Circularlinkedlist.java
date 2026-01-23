package Clircularlinkedlist;

public class Circularlinkedlist {

    private Node last;
    private static  int length;

    private class Node {

        int data;
        Node next;

        
        public Node(int data) {
            this.data = data;
        }

    }
public static int length(){
    return length;
}
public boolean isEmpty(){
   if(length!=0)
   return true;
   else
   return false;
}
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    void printNodes(){
        if(last==null ){
            System.out.println("Empty list");
            return;
        }
        Node first =last.next;
        while(first!=last){
            System.out.println(first.data);
            first=first.next;
        }
        System.out.println(first.data);
    }

    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(last == null){
            last=newNode;
            last.next=last;

        }else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        length++;
    }
    
    void removeFirst(){
        if(isEmpty()){
            System.out.println("Empty list");
        }
        Node temp=last.next;
        if(last.next == last){
            last=null;
        }
        else{
        last.next=temp.next;
        }
        temp.next=null;
        length--;
    }
    public static void main(String args[]) {
Circularlinkedlist l=new Circularlinkedlist();
l.insertAtBeginning(8);
l.insertAtBeginning(4);
l.insertAtEnd(6);
l.printNodes();
System.out.println("Length : ");
System.out.print(length());
l.removeFirst();
l.printNodes();
System.out.println("Length : ");
System.out.print(length());

    }
}
