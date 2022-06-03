package Graph_Algorithms;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class BGraph {
    public int V;
    public LinkedList<Integer> [] adjList;

    public BGraph(int v) {
        this.V = v;
        adjList = new LinkedList[V];

        for (int i = 0; i <V ; i++) {
            adjList[i] = new LinkedList<>();

        }
    }
    public void add_edge(int start, int end){
        adjList[start].add(end);
        adjList[end].add(start);

    }

    public void graph_printer(){
        for (int i = 0; i <V ; i++) {
            System.out.println("NODE ["+i+"]"+adjList[i]);

        }
    }
    public void BFS(int start){
        boolean visited [] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start]=true;


        while (!queue.isEmpty()){
            int poped = queue.remove();
            System.out.print(poped+"->");
            ListIterator<Integer> l = adjList[start].listIterator();
            for (ListIterator<Integer> it = l; it.hasNext(); ) {
                int n = it.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }

            }
            if(!queue.isEmpty()){
                start = queue.peek();

            }




        }


    }
}
