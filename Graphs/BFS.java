/*
=====================================================================================
Need to store the graph
    Initialize an ArrayList
    Initialize internal ArrayLists based on no of nodes using the constructor
Make the connections
    Create a method like 'addEdge'
    Using a.get(from).add(to) make an edge
    If its non directional graph a.get(to).add(from)
=======================================================================================
Now BFS Traversal 
Initialize a Queue using LinkedList<>() . If we need to specify queue size use ArrayDeque<>()
Initialise a visitedSet using HashSet so that it won't store duplicates.

    Add starting node to queue using 'offer' method.
    Loop based on !Queue.isEmpty()
        Get CurrentNode with 'poll' method.
        Print CurrentNode
        Loop CurrentNode List for neighbours
            Check !visited.contains(neighbor)
                Add neighbours to visitedSet                             visited.add(neighbor); 
                Add neighbours to Queue                                  q.offer(neighbor);  
    
    
=======================================================================================        
*/



import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS{

private ArrayList<ArrayList<Integer>>  a;

private int nodes;

public BFS(int nodes){
    this.nodes = nodes ;
    a = new ArrayList<>(nodes);
        
        // Initialize adjacency list for each vertex
        for (int i = 0; i < nodes; i++) {
            a.add(new ArrayList<>());
        }
}


public void addEdge(int v , int w){

    a.get(v).add(w);
    a.get(w).add(v);
}

public void breadthFirstSearch(int start){
    
    Queue<Integer> q =new LinkedList<>();
     Set<Integer> visited = new HashSet<>(); // Set to track visited nodes
     visited.add(start);
     q.offer(start);        // First make the start node as visited
     System.out.println("BFS Traversal starting from node " + start + ":");
     while(!q.isEmpty()){
        int curr = q.poll();        //Print Curr node
        System.out.print(curr + " ");


        for(int neighbor : a.get(curr)){
            if(!visited.contains(neighbor)){
                visited.add(neighbor);  // Make the neighbours to be visited   
                q.offer(neighbor);      // Adding neignbours to queue 
            }
        }
     }

}
    

/*   Queue        
 offer  is usedd to push    i.e, enqueue
 poll is used pop     i.e, dequeue
 * 
 * 
Method	Description
add(E e)	Inserts an element into the queue. Throws an exception if the queue is full.
offer(E e)	Inserts an element into the queue. Returns false if the queue is full (preferred over add).
remove()	Removes and returns the head of the queue. Throws NoSuchElementException if the queue is empty.
poll()	Removes and returns the head of the queue. Returns null if the queue is empty.
element()	Retrieves the head of the queue without removing it. Throws NoSuchElementException if empty.
peek()	Retrieves the head of the queue without removing it. Returns null if empty.

 * 
 */

    public static void main(String[] args) {

        BFS b = new BFS(8);
        b.addEdge(1, 3);
        b.addEdge(1, 4);
        b.addEdge(2, 4);
        b.addEdge(3, 5);
        b.addEdge(4, 5);

        // Perform BFS from node 1
        b.breadthFirstSearch(1);
     
        
    }
}
