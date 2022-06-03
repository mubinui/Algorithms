package Testers;

import Graph_Algorithms.BGraph;

public class BGraphTester {
    public static void main(String[] args) {
        BGraph g = new BGraph(6);
        g.add_edge(1,0);
        g.add_edge(0,5);
        g.add_edge(0,2);
        g.add_edge(1,2);
        g.add_edge(2,5);
        g.add_edge(1,3);
        g.add_edge(3,4);
        g.add_edge(4,5);
        g.add_edge(2,4);

        g.graph_printer();

        System.out.print("BFS->>");
        g.BFS(2);

    }
}
