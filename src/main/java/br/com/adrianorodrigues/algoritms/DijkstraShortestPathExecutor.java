package br.com.adrianorodrigues.algoritms;


import br.com.adrianorodrigues.interfaces.Executable;

public class DijkstraShortestPathExecutor implements Executable {

    @Override
    public String getTitle() {
        return "Dijkstra Shortest Path Algoritm";
    }

    @Override
    public void execute() {
        int[][] graph = new int[][]{
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}};
        DijkstraShortestPath t = new DijkstraShortestPath();
        t.dijkstra(graph, 0);
    }
}
