 package SinglyLinkedList;
 import java.util.*;

 class Linkedlist{

    private Node head;

    private class Node{
        Node next;
        int data;
         public Node(int data){
            this.data = data;
         }
    }

    public void insertAtBegin(int data)
    {
        Node newNode =new Node(data);
        newNode.next = head;
        head = newNode;

    }
    public void display(){
        Node c = head;
        while(c!=null){
            System.out.print(c.data + "-> ");
            c =c.next;
        }
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

    }

}