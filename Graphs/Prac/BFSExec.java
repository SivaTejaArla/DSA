/*

           1
         /   \
        2     3
      /  \   / \
     4    5 6   7
      \  /   \   \
       8 -----9   10
        \         /
         \-------/

*/

package Prac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BFSExec {

    static List<ArrayList<Integer>> nodeList = new ArrayList<>();

    static int totalNodes = 0;

    BFSExec(int nodes) {
        totalNodes = nodes;
        for (int i = 0; i <= totalNodes; i++) {
            nodeList.add(new ArrayList<>());
        }
    }

    static void addEdge(int from, int to) {

        nodeList.get(from).add(to);
        nodeList.get(to).add(from);

    }

    static void bfs(int start) {
        Queue<Integer> bfsQueue = new LinkedList<>();
        Set<Integer> visitedSet = new HashSet<>();
        visitedSet.add(start);
        bfsQueue.offer(start);
        System.out.println("Bfs Traversal : ");
        while (!bfsQueue.isEmpty()) {
            int currentNode = bfsQueue.poll();
            System.out.print(currentNode + " : ");

            for (int neighbor : nodeList.get(currentNode)) {

                if (!visitedSet.contains(neighbor)) {

                    visitedSet.add(neighbor);
                    bfsQueue.offer(neighbor);
                }
            }

        }

    }

    public static void main(String[] args) {

        BFSExec b = new BFSExec(10);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(2, 5);
        addEdge(3, 6);
        addEdge(3, 7);
        addEdge(4, 8);
        addEdge(5, 8);
        addEdge(5, 9);
        addEdge(6, 9);
        addEdge(7, 10);
        addEdge(8, 10);

        System.out.println(nodeList);
        bfs(1);

    }

}
