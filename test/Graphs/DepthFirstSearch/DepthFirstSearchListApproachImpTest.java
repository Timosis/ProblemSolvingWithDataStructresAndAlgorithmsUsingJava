package Graphs.DepthFirstSearch;

import main.Graphs.DepthFirstSearch.DepthFirstSearchNeighbourApproachImp;
import main.Graphs.DepthFirstSearch.Node;
import org.junit.Test;

public class DepthFirstSearchNeighbourApproachImpTest {

    @Test
    public void DFSNeighbourApproachImp(){

        Node node40 = new Node(40);
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node60 = new Node(60);
        Node node50 = new Node(50);
        Node node70 = new Node(70);

        node40.addNeighbours(node10);
        node40.addNeighbours(node20);
        node10.addNeighbours(node30);
        node20.addNeighbours(node10);
        node20.addNeighbours(node30);
        node20.addNeighbours(node50);
        node20.addNeighbours(node60);
        node30.addNeighbours(node60);
        node60.addNeighbours(node70);
        node50.addNeighbours(node70);

        System.out.println("The DFS Traversal Of The Graph Using Stack");
        DepthFirstSearchNeighbourApproachImp.DFSUsingStack(node40);

        System.out.println();

        node10.visited = false;
        node20.visited = false;
        node30.visited = false;
        node40.visited = false;
        node50.visited = false;
        node60.visited = false;
        node70.visited = false;

        System.out.println("The DFS Traversal Of The Graph Using Recursion");
        DepthFirstSearchNeighbourApproachImp.DFS(node40);

    }
}
