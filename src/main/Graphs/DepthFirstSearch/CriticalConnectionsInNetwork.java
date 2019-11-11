package main.Graphs.DepthFirstSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalConnectionsInNetwork {

    static int time = 0; // time when discover each vertex
    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections){
        int[] disc = new int[n]; // it is an array of N elements which stores the discovery time of every vertex. It is initialized by 0.
        int[] low = new int[n];  // it is an array of N elements which stores, for every vertex v, the discovery time of the earliest discovered
                                 // vertex to which v or any of the vertices in the subtree rooted at v is having a back edge.
        List<Integer>[] graph = new ArrayList[n];
        List<List<Integer>> res = new ArrayList<>();
        Arrays.fill(disc,-1); // use disc to track if visited(disc == -1)
        for (int i = 0; i < n ; i++) {
            graph[i] = new ArrayList<>();
        }
        //building graph
        for (int i = 0; i < connections.size() ; i++) {
            int from = connections.get(i).get(0);
            int to = connections.get(i).get(1);
            graph[from].add(to);
            graph[to].add(from);
        }

        for (int i = 0; i < n ; i++) {
            if (disc[i] == -1) {
                dfs(i,low,disc,graph,res,i);
            }
        }
        return res;
    }
    private static void dfs(int i, int[] low, int[] disc, List<Integer>[] graph, List<List<Integer>> res, int pre) {
        disc[i] = low[i] = ++time;
        for (int j = 0; j < graph[i].size() ; j++) {
            int v = graph[i].get(j);
            if (v == pre) {
                continue; // if parent vertex, ignore
            }
            if (disc[v] == -1) {
                dfs(v, low, disc, graph, res, i);
                low[i] = Math.min(low[i], low[v]);
                if (low[v] > disc[i]) {
                    // u - v critical, there is no path for v to readch back to i or previous vertices of u
                    res.add(Arrays.asList(i,v));
                }
            }else { // if v discovered and is not parent of u, update low[i], cannot use low[v] because i is not subtree of v
                low[i] = Math.min(low[i],disc[v]);
            }
        }
    }
}
