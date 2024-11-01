 package SinglyLinkedList;
 import java.util.*;

 class Linkedlist{

    private Node head;

    private class Node{
        Node next;
        int data;
         public Node(int data){
            this.data = data;
            this.next = null;
         }
    }

    public void display(){
        Node c = head;
        int count =0;
        while(c!=null){
            System.out.print(c.data + "-> ");
            c =c.next;
            count++;
        }
        System.out.println();
        System.out.println("Total nodes = " + count);
    }

    public void insertAtBegin(int data)
    {
        Node newNode =new Node(data);
        newNode.next = head;
        head = newNode;

    }


    public void insertEnd(int data){
        Node newNode =new Node(data);
        Node c = head;
        if(c==null){
            System.out.println("The list is empty!! \nCreating the list......");
            newNode.next = head;
            head = newNode;
        }else{
 
            while(c.next!=null){
                c= c.next;
            }
            c.next=newNode;
        }
        
    }

public void insertPos(int data,int p){

    Node c = head;
    int coun = 1;
    while(coun < p -1){
        c = c.next;
        coun ++;
    }
    Node nx = c.next;
    Node newNode = new Node(data);
    c.next = newNode;
    newNode.next = nx;


}

public void deleteFirst(){

    head = head.next;
}
public void deleteEnd(){
    Node c = head;
    while(c.next.next!=null){
        c= c.next;
    }
    c.next = null;
}

public void deletePos(int p){
    Node c = head;
    int cn =1;
    while(cn<p-1){
        c = c.next;
        cn++;
    }
    Node n = c.next.next;
    c.next = n;

}
    public static void main(String args[]){
        Linkedlist l = new Linkedlist();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = s.nextInt();
            l.insertAtBegin(a[i]);      

        }
        l.display();
        l.deletePos(3);
        l.display();
        
    

    }

}