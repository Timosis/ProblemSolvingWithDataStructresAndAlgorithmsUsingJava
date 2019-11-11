package main.Graphs.DepthFirstSearch.NeighbourList;

import java.util.ArrayList;
import java.util.List;

public class Node {
        int data;
        List<Node> neighbours;
        public boolean visited;

        public Node(int data){
            this.data = data;
            this.neighbours = new ArrayList<>();
            this.visited = false;
        }

        public void addNeighbours(Node neighbourNode){
            this.neighbours.add(neighbourNode);
        }

        public List<Node> getNeighbours(){
            return neighbours;
        }

        public void setNeighbours(List<Node> neighbours){
            this.neighbours = neighbours;
        }
}
