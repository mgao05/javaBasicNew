package com.company.algorithm;

import java.util.Arrays;

public class GraphBipartite {
        public static boolean isBipartite(int[][] graph) {
            int[] colors = new int[graph.length];
            Arrays.fill(colors, 0);
            for(int i = 0; i<graph.length;i++){
                if(colors[i] == 0) {
                    boolean res = visitDFS(graph, i, 1, colors);
                    if(!res)
                        return false;
                }
            }
            return true;
        }

        private static boolean visitDFS(int[][] graph, int i, int color, int[] colors){
            if(colors[i] != 0){
                if(colors[i] != color)
                    return false;
                return true;
            }

            // No color set so set color and DFS
            colors[i] = color;
            for(int j=0; j<graph[i].length;j++){
                boolean res = visitDFS(graph, graph[i][j], -color, colors);
                if(!res)
                    return false;
            }

            return true;
        }


        public static void main(String args[]){
            int[][] input = {{1,3},{0,2}, {1,3}, {0,2}};
            boolean result = isBipartite(input);
            System.out.println(result);

        }

    }
