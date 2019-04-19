//package com.company.algorithm;
import java.util.*;
import java.util.LinkedList;

public class Graph {
    private int V;
    private LinkedList<Integer> adj[];
    int time = 0;
    static final int NIL = -1;

    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }
    void APUtil(int u, boolean visited[], int disc[],
                int low[], int parent[], boolean ap[])
    {
        int children = 0;
        visited[u] = true;
        disc[u] = low[u] = ++time;
        Iterator<Integer> i = adj[u].iterator();
        while (i.hasNext())
        {
            int v = i.next();
            if (!visited[v])
            {
                children++;
                parent[v] = u;
                APUtil(v, visited, disc, low, parent, ap);
                low[u]  = Math.min(low[u], low[v]);
                if (parent[u] == NIL && children > 1)
                    ap[u] = true;
                if (parent[u] != NIL && low[v] >= disc[u])
                    ap[u] = true;
            }
            else if (v != parent[u])
                low[u]  = Math.min(low[u], disc[v]);
        }
    }

    void AP() {
        boolean visited[] = new boolean[V];
        int disc[] = new int[V];
        int low[] = new int[V];
        int parent[] = new int[V];
        boolean ap[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            parent[i] = NIL;
            visited[i] = false;
            ap[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                APUtil(i, visited, disc, low, parent, ap);
            }
        }
        int record =0;
            for (int i = 0; i < V; i++) {
                //record = 0;
                if (ap[i] == true) {
                    record++;
                    System.out.print(i + " ");
                }
                }
            if(record ==0) {System.out.println("The graph is biconnected and there is no articulation point!");

            }
        }


    // Driver method
    public static void main(String args[]){
        System.out.println("Articulation points in first graph ");
        Graph g1 = new Graph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.AP();
        System.out.println();

        System.out.println("Articulation points in Second graph");
        Graph g2 = new Graph(4);
        g2.addEdge(2, 1);
        g2.addEdge(1, 2);
        g2.addEdge(1, 2);
        g2.AP();
        System.out.println();

        System.out.println("Articulation points in Third graph ");
        Graph g3 = new Graph(7);
        g3.addEdge(0, 1);
        g3.addEdge(1, 2);
        g3.addEdge(2, 0);
        g3.addEdge(1, 3);
        g3.addEdge(1, 4);
        g3.addEdge(1, 6);
        g3.addEdge(3, 5);
        g3.addEdge(4, 5);
        g3.AP();
    }
}