package main.Graphs.BreathFirstSearch.BFSUsingAdjancenyMatrix;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.*;

public class BFSUsingAdjancenyMatrixImp {
    private Queue<Node> queue;
    static ArrayList<Node> nodes;

    public  BFSUsingAdjancenyMatrixImp(ArrayList<Node> nodes){
        queue = new LinkedList<>();
        this.nodes = nodes;
    }

    public ArrayList<Node> findNeighbours(int[][] adjancenyMatrix, Node node){
        int nodeIndex = 1;
        ArrayList<Node> neighbours = new ArrayList<>();
        for (int i = 0; i <neighbours.size() ; i++) {
            if (nodes.get(i).equals(node)) {
                nodeIndex = i;
                break;
            }
        }
        if (nodeIndex != -1) {
            for (int j = 0; j < adjancenyMatrix[nodeIndex].length ; j++) {
                if (adjancenyMatrix[nodeIndex][j] == 1) {
                    neighbours.add(nodes.get(j));
                }
            }
        }
        return neighbours;
    }

    public void BFS(int[][] adjancenyMatrix, Node node){
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()){
            Node element = queue.remove();
            System.out.print(element.data + " ");
            ArrayList<Node> neighbours = findNeighbours(adjancenyMatrix,element);
            for (int i = 0; i <neighbours.size() ; i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;
                }
            }
        }
    }
}
