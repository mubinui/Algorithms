package Testers;

import Graph_Algorithms.DFSGraph;

public class DFS {
    public static void main(String[] args) {
        DFSGraph<Integer> g = new DFSGraph<>(7);
        g.add_edge(0, 1);
        g.add_edge(1, 4);
        g.add_edge(4, 5);
        g.add_edge(5, 6);
        g.add_edge(3, 6);
        g.add_edge(0, 3);
        g.add_edge(0, 2);
        g.add_edge(2, 5);
        g.add_edge(1, 2);
        g.add_edge(2, 3);
        g.add_edge(3, 5);

    }
}
