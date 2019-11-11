package main.Graphs.DepthFirstSearch.NeighbourList;


import java.util.List;
import java.util.Stack;

/*
* Dfs Neighbour List Approach Implementation
*
* */
public class DepthFirstSearchNeighbourApproachImp {

    // Recursive DFS
    public static void DFS(Node node){
        System.out.print(node.data + " ");
        List<Node> neighbours = node.getNeighbours();
        node.visited = true;
        for (int i = 0; i <neighbours.size() ; i++) {
            Node n = neighbours.get(i);
            if (n != null && !n.visited) {
                DFS(n);
            }
        }
    }

    public static void DFSUsingStack(Node node){
        Stack<Node> stack = new Stack<>();
        stack.add(node);
        while (!stack.empty()){
            Node element = stack.pop();
            if (!element.visited) {
                System.out.print(element.data + " ");
                element.visited = true;
            }
            List<Node> neighbours =  element.getNeighbours();
            for (int i = 0; i < neighbours.size() ; i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    stack.add(n);
                }
            }
        }
    }
}
