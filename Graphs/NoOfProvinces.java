package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NoOfProvinces {

    private static void  bfs(int i , int[][] adj, boolean []vis){
        int n = adj.length;
        Queue <Integer> q = new LinkedList<>();
        vis[i] = true;
        q.add(i);

        while(!q.isEmpty()){
            int front = q.remove();
            for(int  j = 0; j < n; j++){
                if(adj[front][j] == 1 && vis[j] == false){
                    vis[j] = true;
                    q.add(j);
                }
            }
        }
    }
    public static int findCircleNum(int adj[][]){
        int n = adj.length;
        boolean [] vis = new boolean[n];
        int count = 0;
        for(int i = 0; i < n ; i++){
            if(!vis[i]){
                bfs(i,adj,vis);
                count++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int[][] adj = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        int ans = findCircleNum(adj);

        System.out.println("Provinces: " + ans);
    }
}
