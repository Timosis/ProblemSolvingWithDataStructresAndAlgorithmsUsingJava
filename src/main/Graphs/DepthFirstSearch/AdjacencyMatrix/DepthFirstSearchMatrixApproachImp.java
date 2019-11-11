package main.Graphs.DepthFirstSearch.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearchMatrixApproachImp {

    static ArrayList<Node> nodes = new ArrayList<>();

    public DepthFirstSearchMatrixApproachImp(ArrayList<Node> nodes){
        this.nodes = nodes;
    }

    public ArrayList<Node> findNeighbours(int[][] adjacenyMatrix, Node node){
        int nodeIndex = -1;
        ArrayList<Node> neighbours = new ArrayList<>();
        for (int i = 0; i <nodes.size() ; i++) {
            if (nodes.get(i).equals(node)) {
                nodeIndex = i;
                break;
            }
        }
        if (nodeIndex != -1) {
            for (int i = 0; i < adjacenyMatrix[nodeIndex].length ; i++) {
                if (adjacenyMatrix[nodeIndex][i] == 1) {
                    neighbours.add(nodes.get(i));
                }
            }
        }
        return neighbours;
    }

    public void DFS(int[][] adjacencyMatrix, Node node){
        System.out.print(node.data + " ");
        ArrayList<Node> neighbours = findNeighbours(adjacencyMatrix, node);
        node.visited = true;
        for (int i = 0; i < neighbours.size() ; i++) {
            Node n = neighbours.get(i);
            if (n!=null && !n.visited){
                DFS(adjacencyMatrix,n);
            }
        }
    }

    public void dfsUsingStack(int[][] adjacencyMatrix, Node node){
        Stack<Node> stack = new Stack<>();
        stack.add(node);
        while (!stack.empty()){
            Node element = stack.pop();
            if (!element.visited) {
                System.out.print(element.data + " ");
                element.visited = true;
            }
            ArrayList<Node> neighbours = findNeighbours(adjacencyMatrix, element);
            for (int i = 0; i <neighbours.size() ; i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    stack.add(n);
                }
            }
        }
    }
}
