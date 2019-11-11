package main.Graphs.BreathFirstSearch.BFSUsingNeighbourList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSUsingNeighbourListImp {
    private Queue<Node> queue;
    static ArrayList<Node> nodes = new ArrayList<Node>();

    public BFSUsingNeighbourListImp(){
        queue = new LinkedList<Node>();
    }

    public void BFS(Node node){
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()){
            Node element = queue.remove();
            System.out.print(element.data + " ");
            List<Node> neighbours = element.getNeighbours();
            for (int i = 0; i < neighbours.size() ; i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;
                }
            }
        }
    }




}
