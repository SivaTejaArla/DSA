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
     q.offer(start);
     System.out.println("BFS Traversal starting from node " + start + ":");
     while(!q.isEmpty()){
        int curr = q.poll();
        System.out.print(curr + " ");


        for(int neighbor : a.get(curr)){
            if(!visited.contains(neighbor)){
                visited.add(neighbor);
                q.offer(neighbor);
            }
        }
     }

}


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