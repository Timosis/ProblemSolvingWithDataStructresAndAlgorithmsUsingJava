package Graphs;

import main.Graphs.Graph;
import org.junit.Test;

public class GraphTest {

    @Test
    public void GrapTest(){

        int vertexCount = 5;
        Graph graph = new Graph(vertexCount);

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.printAdjacenyList();
    }
}
