package Graph_Algorithms;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class DFSGraph <K> {
    public int V;
    LinkedList<K> [] adjList;
    public DFSGraph(int v){
        this.V = v;
        adjList = new LinkedList[V];

        for (int i = 0; i <V; i++) {
            adjList[i] = new LinkedList<>();
        }

    }

    public void add_edge(K start, K end ){
        adjList[(int)start].add(end);
        adjList[(int)end].add(start);
    }




    public void DFS(K start){
        boolean [] visited = new boolean[V];
        Stack<K> stack = new Stack<>();
        stack.add(start);
        ListIterator<K> li ;


        while (!stack.isEmpty()){



        }


    }
}
