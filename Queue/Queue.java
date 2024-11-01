package Queue;

public class Queue {
    

private Node front;
private Node rear;
private class Node{
    int data;
    Node next;
    public Node (int data){

this.data=data;

    }
}

void Enqueue(int data){
    Node newNode =new Node(data);
    if(front == null){
        rear=newNode;
        front =rear;
    }
    else{
        rear.next=newNode;
    }
    rear=newNode;

}

void dequeue(){
    if(front == null){
        System.out.println("Empty Queue");
    }
    int result =front.data;
    front=front.next;
    System.out.println("Popped : " +result);
    
}
    public static void main(String[] args) {
        Queue l=new Queue();
        l.Enqueue(1);
        l.Enqueue(2);
        l.Enqueue(5);
        l.dequeue();
        l.dequeue();

    }
}
