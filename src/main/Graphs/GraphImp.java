package main.Graphs;
import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.LinkedList;

/*
* Simple Graph Implemantation
*
* */
public class GraphImp {

    int Vertex;
    ArrayList<ArrayList<Integer>> adjaceny; // Adjaceny List representation of Graph using ArrayList.

    public GraphImp(int vertex){
        this.Vertex = vertex;
        this.adjaceny = new ArrayList<>(Vertex);
        for (int i = 0; i < Vertex ; i++) {
            adjaceny.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v){
        adjaceny.get(u).add(v);
        adjaceny.get(v).add(u);
    }

    public void printAdjacenyList(){
        for (int i = 0; i <adjaceny.size() ; i++) {
            System.out.println("Adjaceny list of " + i);
            for (int j = 0; j <adjaceny.get(i).size() ; j++) {
                System.out.print(adjaceny.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
